PROGRAM EjemploRetornoChar;
    CHARACTER :: resultado;

    INTERFACE

        FUNCTION obtenerCategoria(puntos)
            CHARACTER(10) :: obtenerCategoria;
            INTEGER, INTENT(IN) puntos;
        END FUNCTION obtenerCategoria
    END INTERFACE

    resultado = obtenerCategoria(10);

END PROGRAM EjemploRetornoChar

! Implementación de la función (subproglist)
FUNCTION obtenerCategoria(puntos) CHARACTER :: obtenerCategoria;
    INTEGER, INTENT(IN) puntos;

    ! Cuerpo de la función (fun_body)
    obtenerCategoria = 'A';
END FUNCTION obtenerCategoria