# Memoria: Traducción Dirigida por Sintaxis de Fortran a C

Esta memoria documenta la fase de traducción dirigida por sintaxis (TDS) para el traductor de Fortran a C, enfocándose en la estructura de clases del Árbol Sintáctico Abstracto (AST), la gestión de atributos en la gramática y el uso de los archivos de prueba.

---

## 1. Estructura de Clases (Árbol Sintáctico Abstracto)

Para la generación del código C final, se ha optado por construir un Árbol Sintáctico Abstracto (AST) durante el análisis sintáctico. Este AST está conformado por una jerarquía de clases Java que representan los distintos componentes del programa.

### 1.1 Clase Base: `ComponenteC`
Todas las clases del AST heredan de la clase abstracta `ComponenteC`. Esta clase define el contrato principal del árbol mediante el método abstracto:
```java
public abstract String generarCodigo(int nivel);
```
El parámetro `nivel` se utiliza para la indentación, permitiendo que el código C generado esté correctamente formateado. Además, provee el método de utilidad `tab(int nivel)` para inyectar espacios.

### 1.2 El Nodo Raíz: `ProgramaC`
La clase `ProgramaC` representa el programa principal en Fortran (`PROGRAM`). Almacena el contexto global del programa mediante listas:
- `constantes` (List<ConstanteC>)
- `variablesMain` (List<VariableC>)
- `interfaces` y `implementaciones` (List<SubprogramaC>) para la cabecera e implementación de funciones/rutinas.
- `sentenciasMain` (List<SentenciaC>) para el cuerpo del programa.

Su método `generarCodigo` es el orquestador que imprime los `#define`, las cabeceras, las implementaciones y finalmente el `void main (void) { ... }`.

### 1.3 Sentencias (`SentenciaC`)
Las instrucciones que van dentro de los bloques principales o de funciones heredan de `SentenciaC` (que a su vez hereda de `ComponenteC`). Algunas de estas clases son:
- **`AsignacionC`**: Maneja asignaciones y controla internamente si la variable destino es un puntero (útil para los parámetros por referencia).
- **`BucleForC` y `BucleWhileC`**: Traducen los bucles `DO` de Fortran (tanto incondicionales como basados en contador) a constructos `for` y `while` de C.
- **`IfC`**: Almacena listas de sentencias para los bloques `if` y opcionalmente para un bloque `else`.
- **`SelectCaseC` y `CasoC`**: Representan el constructo `SELECT CASE`. `CasoC` representa cada `CASE`, mientras que `SelectCaseC` engloba todo el switch.
- **`LlamadaC`**: Representa las llamadas a rutinas (`CALL`) adaptando los argumentos si se pasan por referencia.

### 1.4 Otros Nodos Auxiliares
- **`VariableC` y `ConstanteC`**: Representan declaraciones. Almacenan tipo, identificador y valor inicial.
- **`SubprogramaC`**: Representa tanto `SUBROUTINE` como `FUNCTION`. Contiene sus propios parámetros (`ParametroC`), variables locales y lista de sentencias.
- **`ParametroC`**: Especifica el tipo, nombre y si su comportamiento (INTENT) es `IN`, `OUT` o `INOUT`.

---

## 2. Manejo de Atributos en la Gramática (ANTLR)

La gramática (`Translator.g4`) hace un uso intensivo de **atributos sintetizados**, **atributos heredados** y **variables de contexto global** para poblar el AST y controlar la semántica.

### 2.1 Variables de Contexto Global (`@parser::members`)
Se utilizan variables globales dentro del analizador para mantener el estado de la traducción:
- `ProgramaC programaGlobal;`: Referencia al programa raíz para registrar subprogramas globales.
- `SubprogramaC subprogramaActual;`: Permite saber en qué función/rutina se está analizando el código actualmente, lo que es vital para:
  1. Validar parámetros.
  2. Saber si un parámetro es por referencia (`esPuntero`) y necesita desreferenciarse al usarse.

### 2.2 Atributos Sintetizados (`returns [...]`)
La información "sube" por el árbol de parseo usando atributos de retorno. Se usan tanto para construir objetos del AST como para subir cadenas procesadas:
- **Cadenas y Expresiones**: Reglas como `exp returns [String val]`, `tipo returns [String t]` y `op returns [String val]` evalúan expresiones matemáticas, tipos base y operadores, devolviéndolos como texto ya traducido a formato C.
- **Construcción de Nodos**: Reglas como `sent returns [SentenciaC sentVal]` sintetizan una sentencia completa (como `IfC` o `BucleWhileC`) que luego será añadida a una lista por su padre.
- **Constructos Complejos**: `decproc returns [SubprogramaC sub]` devuelve el objeto de la rutina ya rellenado con sus variables y sentencias.

### 2.3 Atributos Heredados (`[...]`)
Los atributos heredados permiten pasar información (contexto) "hacia abajo" en el árbol:
- **Paso de Listas para poblar**: Las reglas de listas reciben listas vacías de su nodo padre para irlas rellenando.
  - Ejemplo: `dcllist[List<VariableC> vars, List<ConstanteC> consts]` recibe las listas del `programaGlobal` o `subprogramaActual` y se las pasa a las reglas hijas `dcl` para que inserten allí las variables detectadas.
- **Propagación del Tipo Base**: En una declaración como `INTEGER :: a, b;`, la regla `dcl_varcte[String tipoBase, ...]` recibe el tipo "int" heredado desde su hermano izquierdo (`tipo`) y se lo aplica a todas las variables de la lista.
- **Evaluación de Expresiones y Recursividad por la Izquierda**: Para reglas de evaluación (como `exp_prime[String valHeredado]`), se hereda la parte ya acumulada de la expresión (ej. `a + b`) para encadenarla con los nuevos operadores y factores sin ambigüedades.

---

## 3. Pruebas y Validación (Archivos `.for`)

Para validar el sistema, se ha desarrollado un robusto banco de pruebas que incluye código Fortran de diversos niveles de complejidad (`.for`) que generan sus correspondientes traducciones en C (`.c`).

### 3.1 Pruebas Correctas (Casos de Éxito)
Los archivos `correcto1.for`, `correcto2.for`, `correcto3.for`, y `correcto4.for`, además de `char.for` y `funciones.for`, validan flujos funcionales completos:
- **Constructos Básicos**: Traducción de asignaciones, tipos (`INTEGER`, `REAL`, `CHARACTER`) e impresión de literales.
- **Estructuras de Control**: Anidamiento de bucles `DO`, `IF-ELSE` y `SELECT CASE`.
- **Llamadas y Procedimientos**: Correcta gestión de funciones y subrutinas, especialmente el comportamiento de los punteros (`&` y `*`) cuando los parámetros usan `INTENT(OUT)` o `INTENT(INOUT)`.

### 3.2 Pruebas de Errores (Casos de Fallo)
Se incluyen archivos como `err1.for`, `err2.for`, `err3.for`, `err4.for` y `nuevoserrores.for` diseñados explícitamente para activar los analizadores de errores léxicos, sintácticos y semánticos:
- **Errores Léxicos (`err1.for`)**: Caracteres ilegales, nombres de variables con símbolos no permitidos (`$`, `%`, `€`).
- **Errores Sintácticos y Semánticos**: 
  - Discordancia de nombres entre cabecera y el `END SUBROUTINE` o `END PROGRAM`.
  - Falta de asignación del valor de retorno en la última sentencia de una función (verificado mediante `$fun.validarRetornoEstricto()`).
  - Discordancia en los modificadores `INTENT` definidos en los parámetros formales.

Esta suite asegura que las acciones embebidas en el ANTLR (como `notifyErrorListeners`) se lancen correctamente, deteniendo traducciones inconsistentes y notificando al usuario de forma clara.
