PROGRAM test_errores_lexicos ;
    ! --- Declaraciones válidas ---
    INTEGER :: contador = 0;
    REAL :: precio = 15.5;
    CHARACTER(20) :: saludo = 'Hola';

    contador = contador @ 5;
    precio = precio ? 2.0;

    INTEGER :: mi$variable = 10;
    REAL :: variable#numero = 3.14;

    saludo = \Hola;

    contador = 10 % 2;
    contador = 10 | 5;
    precio = 100.0 €;
    contador = ~contador;

END PROGRAM test_errores_lexicos