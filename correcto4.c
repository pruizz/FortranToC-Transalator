#include <stdio.h>
#include <stdlib.h>

#define frecuencia 44100
#define ganancia 1.25

float AplicarFiltro(float val, float factor);
void NotificarFin(void);

float AplicarFiltro(float val, float factor) {
    float aux;
    aux = val * factor;
    return aux;
}

void NotificarFin(void) {
    muestra_id = 0;
}

void main (void) {
    int muestra_id = 0;
    int categoria = 0;
    float amplitud = 0.85;

    for(muestra_id=1; muestra_id!=50; muestra_id=muestra_id+2) {
        amplitud = AplicarFiltro(amplitud, ganancia);
        switch (muestra_id) {
            case < 10:
                categoria = 1;
                break;
            case 20 to 40:
                categoria = 2;
                break;
            default:
                categoria = 0;
                break;
        }
    }
    if (categoria == 4 == 1) {
        NotificarFin();
    }
}
