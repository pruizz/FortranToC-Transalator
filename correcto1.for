PROGRAM prog1 ;

INTEGER, PARAMETER :: max_val = 100, min_val = -50;
REAL, PARAMETER :: pi = 3.1415, e = 2.71828, c = 2e-6;

INTEGER :: contador = 0, acumulador;
REAL :: promedio, total = 0.0;
CHARACTER(10) :: mensaje1 = 'Hola', mensaje2 = 'Mundo';

INTEGER :: base_bin = b'011', base_oct = o'740', base_hex = z'A34';
INTEGER :: i = 0, opcion = 2;

    INTERFACE

        SUBROUTINE ImprimirMensaje(texto)
            CHARACTER(10), INTENT(IN) texto;
        END SUBROUTINE ImprimirMensaje

        FUNCTION Sumar(a, b)
            INTEGER :: Sumar;
            INTEGER, INTENT(IN) a;
            INTEGER, INTENT(IN) b;
        END FUNCTION Sumar

    END INTERFACE

    contador = contador + 1;
    total = total + 45.6;
    CALL ImprimirMensaje('Bienvenido');
    promedio = total / 2.0;

    IF ( contador < 10 .AND. .TRUE. ) contador = contador + 1;


    IF ( total >= 100.0 .OR. .NOT. .FALSE. ) THEN
        CALL ImprimirMensaje('Mayor');
    ENDIF


    IF ( base_bin == 3 .EQV. .TRUE. ) THEN
        acumulador = 1;
    ELSE
        acumulador = 0;
    ENDIF

    ! 4. Bucle DO WHILE
    DO WHILE ( contador <= 5 )
        contador = contador + 1;
    ENDDO

    ! 5. Bucle DO iterativo (for)
    DO i = 1, 10, 1
        acumulador = acumulador + i;
    ENDDO

    ! 6. Estructura SELECT CASE con todas las variantes de etiquetas
    SELECT CASE (opcion)
        CASE (1)                   ! Valor simple
            acumulador = 1;
        CASE (2, 3, 4)             ! Lista de valores separados por coma
            acumulador = 2;
        CASE (10 : 20)             ! Rango completo (inicio : fin)
            acumulador = 3;
        CASE (: 0)                 ! Rango hasta ( : fin )
            acumulador = 4;
        CASE (100 :)               ! Rango desde ( inicio : )
            acumulador = 5;
        CASE DEFAULT               ! Por defecto
            acumulador = 0;
    END SELECT

END PROGRAM prog1

! --- IMPLEMENTACIONES DE FUNCIONES (Obligatorio) ---
SUBROUTINE ImprimirMensaje(texto)
    CHARACTER(10), INTENT(IN) texto;
    CALL MostrarEnPantalla(texto);
END SUBROUTINE ImprimirMensaje

FUNCTION Sumar(a, b)
    INTEGER :: Sumar;
    INTEGER, INTENT(IN) a;
    INTEGER, INTENT(IN) b;

    INTEGER :: suma;
    suma = a + b;
    Sumar = suma;
END FUNCTION Sumar