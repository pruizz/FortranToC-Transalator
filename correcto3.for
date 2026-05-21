PROGRAM simulador_logico_y_control;
    INTEGER, PARAMETER :: ESTADO_OK = o'12', PASO_REDUCCION = 1;
    REAL, PARAMETER :: UMBRAL_CRITICO = 15.5;

    INTEGER :: contador_sistema = 1;
    INTEGER :: nivel_seguridad = 100;
    REAL :: temperatura_actual = 0.0;
    REAL :: presion_actual = 5.0;

    INTERFACE
        SUBROUTINE IncrementarSensores(temp, pres)
            REAL, INTENT(INOUT) temp;
            REAL, INTENT(INOUT) pres;
        END SUBROUTINE IncrementarSensores

        SUBROUTINE EvaluarSeguridad(sensor_t, seguridad)
            REAL, INTENT(IN) sensor_t;
            INTEGER, INTENT(INOUT) seguridad;
        END SUBROUTINE EvaluarSeguridad
    END INTERFACE

    DO WHILE (contador_sistema <= ESTADO_OK .AND. nivel_seguridad /= 0)

        CALL IncrementarSensores(temperatura_actual, presion_actual);

        IF (temperatura_actual >= UMBRAL_CRITICO .OR. .NOT. (presion_actual < 20.0)) THEN
            nivel_seguridad = nivel_seguridad - 20;
            CALL EvaluarSeguridad(temperatura_actual, nivel_seguridad);
        ELSE
            nivel_seguridad = nivel_seguridad + 2;
            contador_sistema = contador_sistema + PASO_REDUCCION;
        ENDIF

        presion_actual = presion_actual * 1.02;
        contador_sistema = contador_sistema + 1;
    ENDDO

END PROGRAM simulador_logico_y_control


SUBROUTINE IncrementarSensores(temp, pres)
    REAL, INTENT(INOUT) temp;
    REAL, INTENT(INOUT) pres;
    REAL :: factor_rampa = 1.5;

    temp = temp + factor_rampa;
    pres = pres + (factor_rampa * 0.5);
END SUBROUTINE IncrementarSensores

SUBROUTINE EvaluarSeguridad(sensor_t, seguridad)
    REAL, INTENT(IN) sensor_t;
    INTEGER, INTENT(INOUT) seguridad;

    IF (sensor_t > 30.0) THEN
        seguridad = 0;
    ELSE
        seguridad = seguridad - 5;
    ENDIF
END SUBROUTINE EvaluarSeguridad