PROGRAM test_punteros ;

INTEGER :: x = 10, y = 20;

    INTERFACE
        SUBROUTINE modificar_valores ( a, b, c )
            INTEGER, INTENT(IN) a;
            INTEGER, INTENT(OUT) b;
            INTEGER, INTENT(INOUT) c;
        END SUBROUTINE modificar_valores
    END INTERFACE

    ! Llamada al procedimiento
    CALL modificar_valores(5, x, y);

END PROGRAM test_punteros

SUBROUTINE modificar_valores ( a, b, c )
    INTEGER, INTENT(IN) a;
    INTEGER, INTENT(OUT) b;
    INTEGER, INTENT(INOUT) c;

    ! Modificamos las variables pasadas por referencia
    b = a + 10;
    c = c + a;
END SUBROUTINE modificar_valores