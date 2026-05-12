#include <stdio.h>
#include <stdlib.h>

#define max_val 100
#define min_val -50
#define pi 3.1415
#define e 2.71828
#define c 2e-6

void ImprimirMensaje(char texto[]);
int Sumar(int a, int b);

void ImprimirMensaje(char texto[]) {
    MostrarEnPantalla(texto);
}

int Sumar(int a, int b) {
    int suma;
    suma = a + b;
    return suma;
}

void main (void) {
    int contador = 0;
    int acumulador;
    float promedio;
    float total = 0.0;
    char mensaje1[10] = "Hola";
    char mensaje2[10] = "Mundo";
    int base_bin = 0b011;
    int base_oct = 00740;
    int base_hex = 0xA34;
    int i = 0;
    int opcion = 2;

    contador = contador + 1;
    total = total + 45.6;
    ImprimirMensaje("Bienvenido");
    promedio = total / 2.0;
    if (contador < 10 && 1) {
        contador = contador + 1;
    }
    if (total >= 100.0 || !0) {
        ImprimirMensaje("Mayor");
    }
    if (base_bin == 3 == 1) {
        acumulador = 1;
    } else {
        acumulador = 0;
    }
    while (contador <= 5) {
        contador = contador + 1;
    }
    for(i=1; i!=10; i=i+1) {
        acumulador = acumulador + i;
    }
    switch (opcion) {
        case 1:
            acumulador = 1;
            break;
        case 2:
case 3:
case 4:
            acumulador = 2;
            break;
        case 10 to 20:
            acumulador = 3;
            break;
        case < 0:
            acumulador = 4;
            break;
        case > 100:
            acumulador = 5;
            break;
        default:
            acumulador = 0;
            break;
    }
}
