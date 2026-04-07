PROGRAM procesador_dsp ;
INTEGER, PARAMETER :: frecuencia = 44100;
REAL, PARAMETER :: ganancia = 1.25;

INTEGER :: muestra_id = 0, categoria = 0;
REAL :: amplitud = 0.85;

    INTERFACE
        FUNCTION AplicarFiltro(val, factor)
            REAL :: AplicarFiltro;
            REAL, INTENT(IN) val;
            REAL, INTENT(IN) factor;
        END FUNCTION AplicarFiltro

        SUBROUTINE NotificarFin
        END SUBROUTINE NotificarFin
    END INTERFACE

    DO muestra_id = 1, 50, 2
        amplitud = AplicarFiltro(amplitud, ganancia);
        SELECT CASE (muestra_id)
            CASE (: 10)
                categoria = 1;
            CASE (20 : 40)
                categoria = 2;
            CASE DEFAULT
                categoria = 0;
        END SELECT
    ENDDO

    ! Corregido: CALL sin paréntesis para cumplir con subpparamlist
    IF ( categoria == 4 .EQV. .TRUE. ) CALL NotificarFin;

END PROGRAM procesador_dsp

FUNCTION AplicarFiltro(val, factor)
    REAL :: AplicarFiltro;
    REAL, INTENT(IN) val;
    REAL, INTENT(IN) factor;
    REAL :: aux;
    aux = val * factor;
    AplicarFiltro = aux;
END FUNCTION AplicarFiltro

SUBROUTINE NotificarFin
    muestra_id = 0;
END SUBROUTINE NotificarFin