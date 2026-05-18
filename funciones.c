#include <stdio.h>
#include <stdlib.h>

void modificar_valores(int a, int * b, int * c);

void modificar_valores(int a, int * b, int * c) {
    *b = a + 10;
    *c = *c + a;
}

void main (void) {
    int x = 10;
    int y = 20;

    modificar_valores(5, &x, &y);
}
