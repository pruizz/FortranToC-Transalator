PROGRAM mi_programa_principal ;

! --- Declaraciones ---
INTEGER :: x = 0;

    ! --- Cabeceras (Prototipos) ---
    INTERFACE
        SUBROUTINE proceso_prueba(a, b)
            INTEGER, INTENT(IN) a;
            REAL, INTENT(OUT) b;
        END SUBROUTINE proceso_prueba

        FUNCTION funcion_prueba(x) INTEGER :: funcion_prueba;
            INTEGER, INTENT(IN) x;
        END FUNCTION funcion_prueba
    END INTERFACE

    ! --- Sentencias Main ---
    x = 1;

! ERROR SEMÁNTICO 1: El nombre del END PROGRAM no coincide
END PROGRAM nombre_falso

! --- Implementaciones de funciones ---

SUBROUTINE proceso_prueba(a, b)
    INTEGER, INTENT(IN) a;
    ! ERROR SEMÁNTICO 2: En la cabecera era REAL y OUT. Aquí es INTEGER e INOUT.
    INTEGER, INTENT(INOUT) b;

    b = a;
END SUBROUTINE proceso_prueba


! ERROR SEMÁNTICO 3: El nombre de la variable de retorno no coincide con la función
FUNCTION funcion_prueba(x) INTEGER :: variable_equivocada;
    INTEGER, INTENT(IN) x;

    variable_equivocada = x;

! ERROR SEMÁNTICO 4: El nombre del END FUNCTION no coincide
END FUNCTION otra_funcion