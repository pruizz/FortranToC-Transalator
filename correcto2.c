#define LIMITE_CICLOS 10
#define MULTIPLICADOR 0b1010
#define PI_COMPLETO 3.141592
#define GRAVEDAD_TIERRA 9.806

void ProcesarGeometria(float r, float h, float * area, float * vol, int * ejecuciones);
int CalcularAjusteLineal(int base_val, int factor);

void ProcesarGeometria(float r, float h, float * area, float * vol, int * ejecuciones) {
    float calculo_temporal = 0.0;
    calculo_temporal = r * r;
    *area = PI_COMPLETO * calculo_temporal;
    *vol = *area * h;
    *ejecuciones = *ejecuciones + 1;
    calculo_temporal = *vol * GRAVEDAD_TIERRA;
    *vol = *vol + 0.01;
}


int CalcularAjusteLineal(int base_val, int factor) {
    int temporal_suma = 0;
    temporal_suma = base_val * factor;
    temporal_suma = temporal_suma + 1;
    temporal_suma = temporal_suma + 2;
    temporal_suma = temporal_suma + 3;
    return temporal_suma;
}


void main (void) {
    char ID_SISTEMA[2] = "A1";
    int iterador_bucle = 0;
    int total_iteraciones = 0;
    int valor_inicial = 5;
    int resultado_final = 0;
    float radio_calculo = 2.5;
    float altura_calculo = 10.0;
    float area_acumulada = 0.0;
    float volumen_acumulado = 0.0;

    valor_inicial = valor_inicial * MULTIPLICADOR + 2;
    radio_calculo = radio_calculo + 0.5;
    for(iterador_bucle=1; iterador_bucle!=LIMITE_CICLOS; iterador_bucle=iterador_bucle+1) {
        ProcesarGeometria(radio_calculo, altura_calculo, &area_acumulada, &volumen_acumulado, &total_iteraciones);
        radio_calculo = radio_calculo + 0.1;
        altura_calculo = altura_calculo - 0.2;
    }
    resultado_final = CalcularAjusteLineal(valor_inicial, total_iteraciones);
    resultado_final = resultado_final + 0b11;
}
