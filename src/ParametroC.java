public class ParametroC extends ComponenteC  {
    public String tipo;
    public String nombre;
    public String modo; // "IN", "OUT", "INOUT"
    public boolean esArrayChar;

    public ParametroC(String tipo, String nombre, String modo) {
            this.tipo = tipo;
            this.nombre = nombre;
            this.modo = modo;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}
