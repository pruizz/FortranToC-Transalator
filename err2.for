PROGRAM error_sin_if ;
INTEGER :: contador = 10;

! Error Sintáctico: Faltan los paréntesis '(' y ')' en la condición
IF contador > 0 THEN
    contador = contador - 1;
ENDIF

END PROGRAM error_sin_if