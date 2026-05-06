PROGRAM prueba ;

INTEGER :: x ;

INTERFACE
    SUBROUTINE calculo (a, b)
        INTEGER , INTENT (IN) a ;
        REAL , INTENT (OUT) b ;
    END SUBROUTINE calculo
END INTERFACE

x = 5 ;
CALL calculo (x, 10.0) ;

END PROGRAM prueba

SUBROUTINE calculo (a, b)
    INTEGER , INTENT (IN) a ;
    REAL , INTENT (OUT) b ;

    b = a + 2.5 ;
END SUBROUTINE calculo