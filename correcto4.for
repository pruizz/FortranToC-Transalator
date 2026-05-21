PROGRAM procesador_estados_avanzado;
    INTEGER, PARAMETER :: CONFIG_BITS = b'1101', MASCARA_HEX = z'FF';
    CHARACTER(12) :: MODO_POR_DEFECTO = 'MODO_STANDBY';

    INTEGER :: selector_case = 5;
    INTEGER :: total_registros = 0;
    INTEGER :: codigo_estado = 0;
    CHARACTER(12) :: cadena_registro = 'INICIALIZADO';
    REAL :: eficiencia_calculada = 98.7;

    INTERFACE
        SUBROUTINE EjecutarTransicion(selector, log_msg, codigo)
            INTEGER, INTENT(IN) selector;
            CHARACTER(12), INTENT(INOUT) log_msg;
            INTEGER, INTENT(OUT) codigo;
        END SUBROUTINE EjecutarTransicion

        FUNCTION CalcularMultiplo(base)
            INTEGER :: CalcularMultiplo;
            INTEGER, INTENT(IN) base;
        END FUNCTION CalcularMultiplo
    END INTERFACE

    total_registros = total_registros + 10;

    IF (CONFIG_BITS == 13 .EQV. MASCARA_HEX == 255) THEN
        CALL EjecutarTransicion(selector_case, cadena_registro, codigo_estado);
        total_registros = total_registros + 1;
    ENDIF

    IF (codigo_estado /= 200 .NEQV. eficiencia_calculada < 50.0) THEN
        selector_case = 100;
    ENDIF

    SELECT CASE (selector_case)
        CASE (0)
            codigo_estado = 0;
            cadena_registro = 'ESTADO_RESET';
            total_registros = 0;

        CASE (1, 2, 3)
            codigo_estado = 50;
            cadena_registro = 'FASE_PRE_RUN';
            total_registros = total_registros + 5;

        CASE (4 : 20)
            codigo_estado = 200;
            eficiencia_calculada = eficiencia_calculada - 0.1;
            total_registros = CalcularMultiplo(total_registros);

        CASE (: -1)
            codigo_estado = -500;
            cadena_registro = 'UNDERFLOW_ERR';

        CASE (50 :)
            codigo_estado = 500;
            cadena_registro = 'OVERFLOW_ERR';
            eficiencia_calculada = 0.0;

        CASE DEFAULT
            codigo_estado = 999;
            cadena_registro = MODO_POR_DEFECTO;
    END SELECT

END PROGRAM procesador_estados_avanzado


SUBROUTINE EjecutarTransicion(selector, log_msg, codigo)
    INTEGER, INTENT(IN) selector;
    CHARACTER(12), INTENT(INOUT) log_msg;
    INTEGER, INTENT(OUT) codigo;

    IF (selector == 5) THEN
        log_msg = 'PROCESANDO';
        codigo = 200;
    ELSE
        log_msg = 'FALLIDO';
        codigo = 404;
    ENDIF

    selector = selector + 0;
END SUBROUTINE EjecutarTransicion

FUNCTION CalcularMultiplo(base)
    INTEGER :: CalcularMultiplo;
    INTEGER, INTENT(IN) base;
    INTEGER :: acumulador_local = 0;

    acumulador_local = base * 2;
    acumulador_local = acumulador_local + 1;

    CalcularMultiplo = acumulador_local;
END FUNCTION CalcularMultiplo