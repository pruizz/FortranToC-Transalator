PROGRAM modulo_aritmetico_extenso;
    INTEGER, PARAMETER :: LIMITE_CICLOS = 10, MULTIPLICADOR = b'1010';
    REAL, PARAMETER :: PI_COMPLETO = 3.141592, GRAVEDAD_TIERRA = 9.806;
    CHARACTER(2) :: ID_SISTEMA = 'A1';

    INTEGER :: iterador_bucle = 0, total_iteraciones = 0;
    INTEGER :: valor_inicial = 5, resultado_final = 0;
    REAL :: radio_calculo = 2.5, altura_calculo = 10.0;
    REAL :: area_acumulada = 0.0, volumen_acumulado = 0.0;

    INTERFACE
        SUBROUTINE ProcesarGeometria(r, h, area, vol, ejecuciones)
            REAL, INTENT(IN) r;
            REAL, INTENT(IN) h;
            REAL, INTENT(OUT) area;
            REAL, INTENT(OUT) vol;
            INTEGER, INTENT(INOUT) ejecuciones;
        END SUBROUTINE ProcesarGeometria

        FUNCTION CalcularAjusteLineal(base_val, factor)
            INTEGER :: CalcularAjusteLineal;
            INTEGER, INTENT(IN) base_val;
            INTEGER, INTENT(IN) factor;
        END FUNCTION CalcularAjusteLineal
    END INTERFACE

    valor_inicial = valor_inicial * MULTIPLICADOR + 2;
    radio_calculo = radio_calculo + 0.5;

    DO iterador_bucle = 1, LIMITE_CICLOS, 1
        CALL ProcesarGeometria(radio_calculo, altura_calculo, area_acumulada, volumen_acumulado, total_iteraciones);
        radio_calculo = radio_calculo + 0.1;
        altura_calculo = altura_calculo - 0.2;
    ENDDO

    resultado_final = CalcularAjusteLineal(valor_inicial, total_iteraciones);
    resultado_final = resultado_final + b'11';

END PROGRAM modulo_aritmetico_extenso


SUBROUTINE ProcesarGeometria(r, h, area, vol, ejecuciones)
    REAL, INTENT(IN) r;
    REAL, INTENT(IN) h;
    REAL, INTENT(OUT) area;
    REAL, INTENT(OUT) vol;
    INTEGER, INTENT(INOUT) ejecuciones;
    REAL :: calculo_temporal = 0.0;

    calculo_temporal = r * r;
    area = PI_COMPLETO * calculo_temporal;
    vol = area * h;
    ejecuciones = ejecuciones + 1;
    calculo_temporal = vol * GRAVEDAD_TIERRA;
    vol = vol + 0.01;
END SUBROUTINE ProcesarGeometria

FUNCTION CalcularAjusteLineal(base_val, factor)
    INTEGER :: CalcularAjusteLineal;
    INTEGER, INTENT(IN) base_val;
    INTEGER, INTENT(IN) factor;
    INTEGER :: temporal_suma = 0;

    temporal_suma = base_val * factor;
    temporal_suma = temporal_suma + 1;
    temporal_suma = temporal_suma + 2;
    temporal_suma = temporal_suma + 3;

    CalcularAjusteLineal = temporal_suma;
END FUNCTION CalcularAjusteLineal