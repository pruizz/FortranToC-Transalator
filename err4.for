PROGRAM prog1 ;
INTEGER, PARAMETER :: max_val = 100, min_val = -50;
RAEL, PARAMETER :: pi = 3.1415, e = 2.71828, c = 2e-6;

INTEGER :: contador = , acumulador;
REAL :: promedio, total = 0.0;
CHARCTER(10) :: mensaje1 = Hola, mensaje2 = 'Mundo';

    INTERFACE

        SUBROUTINE ImprimirMensaje(texto)
            CHARACTER(10), INTENT(IN) texto;
        END SUBROUTINE ImprimirMensaje

        FUNCTION Sumar(a, b)
            INTEGER :: Sumar;
            INTGER, INTENT(IN) a;
            INTEGER, INTENT(IN) b;
        END FUNCTION Sumar

    END INTERFACE

    contador = contador + 1;
    total = total + 45.6;
    CALL ImprimirMensaje('Bienvenido');
    promedio = total / 2.0;

END PROGRAM prog1

SUBROUTINE ImprimirMensaje(texto)
    CHRACTR(10), INTENT(IN) texto;
    CALL MostrarEnPantalla(texto);
END SUBROUTINE ImprimirMensaje

FUNCTION Sumar(a, b)
    INTEGER :: Sumar;
    INTEGER, INTENT(IN) a;
    INTEGER, INTENT(IN) b;

    INTGER :: suma;
    suma = a + b;
    Sumar = suma;
END FUNCTION Sumar