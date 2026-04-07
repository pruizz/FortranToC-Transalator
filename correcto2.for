PROGRAM termostato_industrial ;
! --- Declaraciones obligatorias ---
REAL, PARAMETER :: temp_max = 120.5, temp_critica = 150.0;
INTEGER, PARAMETER :: modo_auto = z'0A', modo_manual = z'0B';

REAL :: temperatura_actual = 25.0, presion = 1.0;
INTEGER :: estado_sistema = 0, ciclos = 0;
CHARACTER(15) :: estado_msg = 'INICIANDO';

    INTERFACE
        SUBROUTINE AlertaSeguridad(codigo, nivel)
            INTEGER, INTENT(IN) codigo;
            CHARACTER(15), INTENT(IN) nivel;
        END SUBROUTINE AlertaSeguridad

        FUNCTION CalcularPresion(t)
            REAL :: CalcularPresion;
            REAL, INTENT(IN) t;
        END FUNCTION CalcularPresion
    END INTERFACE

    ! --- Lógica de control ---
    ciclos = ciclos + 1;
    presion = CalcularPresion(temperatura_actual);

    ! Prueba de IF-THEN-ELSE y operadores lógicos
    IF ( temperatura_actual > temp_max .AND. presion > 2.5 ) THEN
        estado_sistema = 1;
        estado_msg = 'PELIGRO';
        CALL AlertaSeguridad(estado_sistema, estado_msg);
    ELSE
        estado_sistema = 0;
        estado_msg = 'NORMAL';
    ENDIF

    ! Uso de bases opcionales y IF simple
    IF ( estado_sistema == b'0' ) temperatura_actual = temperatura_actual + 5.0;

    ! Bucle de enfriamiento
    DO WHILE ( temperatura_actual > 30.0 .OR. ciclos < 100 )
        temperatura_actual = temperatura_actual - 0.5;
        ciclos = ciclos + 1;
    ENDDO

END PROGRAM termostato_industrial

SUBROUTINE AlertaSeguridad(codigo, nivel)
    INTEGER, INTENT(IN) codigo;
    CHARACTER(15), INTENT(IN) nivel;
    CALL RegistroLog(codigo);
END SUBROUTINE AlertaSeguridad

FUNCTION CalcularPresion(t)
    REAL :: CalcularPresion;
    REAL, INTENT(IN) t;
    CalcularPresion = t * 0.015;
END FUNCTION CalcularPresion