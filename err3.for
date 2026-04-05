PROGRAM error_multiple ;
! Error 1: Falta el nombre de la variable entre '::' y '='
INTEGER :: = 100; 

REAL :: total = 0.0;

! Error 2: Falta el punto y coma ';' al final de la asignación
total = 5.5

DO WHILE (total < 10.0)
    total = total + 1.0;
ENDDO

END PROGRAM error_multiple