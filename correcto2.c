#define temp_max 120.5
#define temp_critica 150.0
#define modo_auto 0x0A
#define modo_manual 0x0B

void AlertaSeguridad(int codigo, char nivel[]);
float CalcularPresion(float t);

void AlertaSeguridad(int codigo, char nivel[]) {
    RegistroLog(codigo);
}


float CalcularPresion(float t) {
    return t * 0.015;
}


void main (void) {
    float temperatura_actual = 25.0;
    float presion = 1.0;
    int estado_sistema = 0;
    int ciclos = 0;
    char estado_msg[15] = "INICIANDO";

    ciclos = ciclos + 1;
    presion = CalcularPresion(temperatura_actual);
    if (temperatura_actual > temp_max && presion > 2.5) {
        estado_sistema = 1;
        estado_msg = "PELIGRO";
        AlertaSeguridad(estado_sistema, estado_msg);
    } else {
        estado_sistema = 0;
        estado_msg = "NORMAL";
    }
    if (estado_sistema == 0b0) {
        temperatura_actual = temperatura_actual + 5.0;
    }
    while (temperatura_actual > 30.0 || ciclos < 100) {
        temperatura_actual = temperatura_actual - 0.5;
        ciclos = ciclos + 1;
    }
}
