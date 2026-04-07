PROGRAM gestion_almacen ;
INTEGER, PARAMETER :: stock_min = o'12';
REAL, PARAMETER :: tasa_iva = 0.21;

INTEGER :: items = 50, flags = b'0001';
REAL :: precio = 15.5, coste = 0.0;

    INTERFACE
        SUBROUTINE ActualizarStock(cantidad, operacion)
            INTEGER, INTENT(IN) cantidad;
            CHARACTER(12), INTENT(IN) operacion;
        END SUBROUTINE ActualizarStock

        FUNCTION CalcularCosto(n, p)
            REAL :: CalcularCosto;
            INTEGER, INTENT(IN) n;
            REAL, INTENT(IN) p;
        END FUNCTION CalcularCosto
    END INTERFACE

    coste = CalcularCosto(items, precio);

    IF ( items < stock_min ) THEN
        CALL ActualizarStock(20, 'REPOSICION');
    ELSE
        CALL ActualizarStock(0, 'LECTURA');
    ENDIF

END PROGRAM gestion_almacen

SUBROUTINE ActualizarStock(cantidad, operacion)
    INTEGER, INTENT(IN) cantidad;
    CHARACTER(12), INTENT(IN) operacion;
    items = cantidad;
END SUBROUTINE ActualizarStock

FUNCTION CalcularCosto(n, p)
    REAL :: CalcularCosto;
    INTEGER, INTENT(IN) n;
    REAL, INTENT(IN) p;
    CalcularCosto = n * p;
END FUNCTION CalcularCosto