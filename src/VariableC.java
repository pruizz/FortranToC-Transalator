public class VariableC extends ComponenteC {
    public String tipo;
    public String nombre;
    public String longitud;
    public String inicializacion;

    public VariableC(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}
