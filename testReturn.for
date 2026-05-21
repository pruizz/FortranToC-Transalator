PROGRAM test_semantico_retorno;
    INTEGER :: resultado = 0;

    INTERFACE
        ! Declaraciones de cabecera
        FUNCTION Correcta(a)
            INTEGER :: Correcta;
            INTEGER, INTENT(IN) a;
        END FUNCTION Correcta

        FUNCTION FallaPorOrden(a)
            INTEGER :: FallaPorOrden;
            INTEGER, INTENT(IN) a;
        END FUNCTION FallaPorOrden

        FUNCTION FallaPorFalta(a)
            INTEGER :: FallaPorFalta;
            INTEGER, INTENT(IN) a;
        END FUNCTION FallaPorFalta
    END INTERFACE

    resultado = Correcta(5);
    resultado = FallaPorOrden(5);
    resultado = FallaPorFalta(5);

END PROGRAM test_semantico_retorno


! =========================================================
! 1. CASO VÁLIDO: La asignación de retorno es la última
! =========================================================
FUNCTION Correcta(a) INTEGER :: Correcta;
    INTEGER, INTENT(IN) a;
    INTEGER :: temp = 0;

    temp = a + 10;
    Correcta = temp;
END FUNCTION Correcta


! =========================================================
! 2. CASO ERROR (Orden): Se asigna, pero NO al final
! =========================================================
FUNCTION FallaPorOrden(a) INTEGER :: FallaPorOrden;
    INTEGER, INTENT(IN) a;
    INTEGER :: temp = 0;

    ! Hacemos la asignación de retorno muy pronto
    FallaPorOrden = a;

    ! Esta línea rompe la norma de que el retorno sea el final
    temp = a + 1;
END FUNCTION FallaPorOrden


! =========================================================
! 3. CASO ERROR (Falta): Nunca se le da valor a la función
! =========================================================
FUNCTION FallaPorFalta(a) INTEGER :: FallaPorFalta;
    INTEGER, INTENT(IN) a;
    INTEGER :: temp = 0;

    temp = a * 2;
    ! El programador se olvidó de poner: FallaPorFalta = temp;
END FUNCTION FallaPorFalta