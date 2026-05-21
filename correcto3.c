#define stock_min 0o12
#define tasa_iva 0.21

void ActualizarStock(int cantidad, char operacion[]);
float CalcularCosto(int n, float p);

void ActualizarStock(int cantidad, char operacion[]) {
    items = cantidad;
}


float CalcularCosto(int n, float p) {
    return n * p;
}


void main (void) {
    int items = 50;
    int flags = 0b0001;
    float precio = 15.5;
    float coste = 0.0;

    coste = CalcularCosto(items, precio);
    if (items < stock_min) {
        ActualizarStock(20, "REPOSICION");
    } else {
        ActualizarStock(0, "LECTURA");
    }
}
