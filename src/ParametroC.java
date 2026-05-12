public class ParametroC extends ComponenteC {
    private String tipo, nombre, modo;

    public ParametroC(String tipo, String nombre, String modo) {
        this.tipo = tipo; this.nombre = nombre; this.modo = modo;
    }

    @Override
    public String generarCodigo(int nivel) {
        String tipoC = tipo;
        String dim = "";

        // Truco: Si le llega char[10], lo convertimos en char y le ponemos []
        if (tipo != null && tipo.startsWith("char[")) {
            tipoC = "char";
            dim = "[]";
        }

        if ("OUT".equalsIgnoreCase(modo) || "INOUT".equalsIgnoreCase(modo)) {
            tipoC += " *";
        }

        return tipoC + " " + nombre + dim;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}