public class ParametroC extends ComponenteC {
    private String tipo, nombre, modo;

    public ParametroC(String tipo, String nombre, String modo) {
        this.tipo = tipo; this.nombre = nombre; this.modo = modo;
    }

    @Override
    public String generarCodigo(int nivel) {
        String tipoC = this.tipo;
        if ("OUT".equalsIgnoreCase(this.modo) || "INOUT".equalsIgnoreCase(this.modo)) {
            if (tipoC.startsWith("char[")) {
                tipoC = "char";
            }
            return tipoC + " * " + this.nombre;
        }
        if (tipoC.startsWith("char[")) {
            return "char " + this.nombre + "[]";
        }
        return tipoC + " " + this.nombre;
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