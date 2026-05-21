#define CONFIG_BITS 0b1101
#define MASCARA_HEX 0xFF

void EjecutarTransicion(int selector, char * log_msg, int * codigo);
int CalcularMultiplo(int base);

void EjecutarTransicion(int selector, char * log_msg, int * codigo) {
    if (selector == 5) {
        *log_msg = "PROCESANDO";
        *codigo = 200;
    } else {
        *log_msg = "FALLIDO";
        *codigo = 404;
    }
    selector = selector + 0;
}


int CalcularMultiplo(int base) {
    int acumulador_local = 0;
    acumulador_local = base * 2;
    acumulador_local = acumulador_local + 1;
    return acumulador_local;
}


void main (void) {
    char MODO_POR_DEFECTO[12] = "MODO_STANDBY";
    int selector_case = 5;
    int total_registros = 0;
    int codigo_estado = 0;
    char cadena_registro[12] = "INICIALIZADO";
    float eficiencia_calculada = 98.7;

    total_registros = total_registros + 10;
    if (CONFIG_BITS == 13 !^ MASCARA_HEX == 255) {
        EjecutarTransicion(selector_case, &cadena_registro, &codigo_estado);
        total_registros = total_registros + 1;
    }
    if (codigo_estado != 200 ^ eficiencia_calculada < 50.0) {
        selector_case = 100;
    }
    switch (selector_case) {
        case 0:
            codigo_estado = 0;
            cadena_registro = "ESTADO_RESET";
            total_registros = 0;
            break;
        case 1:
        case 2:
        case 3:
            codigo_estado = 50;
            cadena_registro = "FASE_PRE_RUN";
            total_registros = total_registros + 5;
            break;
        case 4 to 20:
            codigo_estado = 200;
            eficiencia_calculada = eficiencia_calculada - 0.1;
            total_registros = CalcularMultiplo(total_registros);
            break;
        case < -1:
            codigo_estado = -500;
            cadena_registro = "UNDERFLOW_ERR";
            break;
        case > 50:
            codigo_estado = 500;
            cadena_registro = "OVERFLOW_ERR";
            eficiencia_calculada = 0.0;
            break;
        default:
            codigo_estado = 999;
            cadena_registro = MODO_POR_DEFECTO;
    }

}
