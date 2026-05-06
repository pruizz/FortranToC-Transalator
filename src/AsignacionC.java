public class AsignacionC extends SentenciaC {
    public String identificador;
    public String expresionTraducida;

    public AsignacionC(String id, String exp) {
        this.identificador = id;
        this.expresionTraducida = exp;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}