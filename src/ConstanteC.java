public class ConstanteC extends ComponenteC {
    private String tipo, nombre, valor;

    public ConstanteC(String tipo, String nombre, String valor) {
        this.tipo = tipo; this.nombre = nombre; this.valor = valor;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "#define " + nombre + " " + valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}