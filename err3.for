PROGRAM errores_semanticos_nombres ;
    INTEGER :: x = 0;

    INTERFACE
        ! 1. ERROR: El nombre del END SUBROUTINE no coincide con el de apertura
        SUBROUTINE ProcesarDatos(p1)
            INTEGER, INTENT(IN) p1;
        END SUBROUTINE OtraCosa

        ! 2. ERROR: La variable del tipo de retorno no coincide con la funcion
        FUNCTION Calcular(p1)
            INTEGER :: RetornoEquivocado;
            INTEGER, INTENT(IN) p1;
        END FUNCTION Calcular
    END INTERFACE

    x = Calcular(10);

END PROGRAM errores_semanticos_nombres

! 3. ERROR: En la implementacion se define el tipo de un parametro (p2)
! que no existe dentro de los parentesis de la cabecera.
SUBROUTINE ProcesarDatos(p1)
    INTEGER, INTENT(IN) p1;
    INTEGER, INTENT(IN) p2;

    CALL OtraFuncion(p1);
END SUBROUTINE ProcesarDatos

FUNCTION Calcular(p1)
    INTEGER :: RetornoEquivocado;
    INTEGER, INTENT(IN) p1;

    RetornoEquivocado = p1 * 2;
END FUNCTION Calcular