#define ESTADO_OK 0o12
#define PASO_REDUCCION 1
#define UMBRAL_CRITICO 15.5

void IncrementarSensores(float * temp, float * pres);
void EvaluarSeguridad(float sensor_t, int * seguridad);

void IncrementarSensores(float * temp, float * pres) {
    float factor_rampa = 1.5;
    *temp = *temp + factor_rampa;
    *pres = *pres + (factor_rampa * 0.5);
}


void EvaluarSeguridad(float sensor_t, int * seguridad) {
    if (sensor_t > 30.0) {
        *seguridad = 0;
    } else {
        *seguridad = *seguridad - 5;
    }
}


void main (void) {
    int contador_sistema = 1;
    int nivel_seguridad = 100;
    float temperatura_actual = 0.0;
    float presion_actual = 5.0;

    while (contador_sistema <= ESTADO_OK && nivel_seguridad != 0) {
        IncrementarSensores(&temperatura_actual, &presion_actual);
        if (temperatura_actual >= UMBRAL_CRITICO || !(presion_actual < 20.0)) {
            nivel_seguridad = nivel_seguridad - 20;
            EvaluarSeguridad(temperatura_actual, &nivel_seguridad);
        } else {
            nivel_seguridad = nivel_seguridad + 2;
            contador_sistema = contador_sistema + PASO_REDUCCION;
        }
        presion_actual = presion_actual * 1.02;
        contador_sistema = contador_sistema + 1;
    }
}
