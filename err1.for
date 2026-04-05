PROGRAM error_lex_prog ;
INTEGER :: x = 10;
INTEGER :: y = 5;

! Error Léxico: El símbolo @ no existe en tu gramática
x = x @ y;

! Error Léxico: El símbolo ? tampoco está definido
y = y ? 2;

END PROGRAM error_lex_prog