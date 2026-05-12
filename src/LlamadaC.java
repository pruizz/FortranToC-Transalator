public class LlamadaC extends SentenciaC {
    private String nombre;
    private String argumentos;

    public LlamadaC(String nombre, String argumentos) {
        this.nombre = nombre;
        this.argumentos = (argumentos == null) ? "" : argumentos;
    }

    @Override
    public String generarCodigo(int nivel) {
        return ComponenteC.tab(nivel) + nombre + "(" + argumentos + ");";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String argumentos) {
        this.argumentos = argumentos;
    }
}