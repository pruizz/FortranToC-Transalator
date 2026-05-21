PROGRAM errores_sintacticos ;
    ! 1. ERROR: Falta el punto y coma obligatorio al final de esta declaracion
    INTEGER :: contador = 0
    REAL :: precio = 10.5;

    ! 2. ERROR: Sentencia mezclada antes de terminar el bloque de declaraciones
    ! Tu gramatica obliga a que todas las dcllist vayan antes que las sentlist
    contador = contador + 1;
    INTEGER :: variable_tardia = 5;

    INTERFACE
        SUBROUTINE mostrar(texto)
            CHARACTER(10), INTENT(IN) texto;
        END SUBROUTINE mostrar
    END INTERFACE

    ! 3. ERROR: Falta la palabra THEN en la estructura del IF
    IF (contador > 0)
        contador = 0;
    ENDIF

    ! 4. ERROR: Bloque SELECT CASE sin cerrar (falta el END SELECT)
    SELECT CASE (contador)
        CASE (1)
            precio = 0.0;
        CASE DEFAULT
            precio = 1.0;

END PROGRAM errores_sintacticos