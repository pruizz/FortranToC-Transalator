PROGRAM errores_semanticos_retorno ;
    INTEGER :: resultado = 0;

    INTERFACE
        FUNCTION CalculoIncompleto(a)
            INTEGER :: CalculoIncompleto;
            INTEGER, INTENT(IN) a;
        END FUNCTION CalculoIncompleto

        FUNCTION CalculoDesordenado(a)
            INTEGER :: CalculoDesordenado;
            INTEGER, INTENT(IN) a;
        END FUNCTION CalculoDesordenado
    END INTERFACE

    resultado = CalculoIncompleto(5);
    resultado = CalculoDesordenado(5);

END PROGRAM errores_semanticos_retorno

! 1. ERROR: La funcion termina sin asignar valor a CalculoIncompleto
FUNCTION CalculoIncompleto(a)
    INTEGER :: CalculoIncompleto;
    INTEGER, INTENT(IN) a;
    INTEGER :: temporal = 0;

    temporal = a * 10;
    ! Se nos olvido hacer la asignacion de retorno
END FUNCTION CalculoIncompleto

! 2. ERROR: Se asigna el retorno, pero NO es la ultima sentencia
FUNCTION CalculoDesordenado(a)
    INTEGER :: CalculoDesordenado;
    INTEGER, INTENT(IN) a;
    INTEGER :: temporal = 0;

    ! Hacemos la asignacion de retorno demasiado pronto
    CalculoDesordenado = a * 2;

    ! Y despues ejecutamos otra cosa (ilegal segun tu validacion)
    temporal = temporal + 1;
END FUNCTION CalculoDesordenado