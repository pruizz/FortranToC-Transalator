import java.util.List;

public class BucleWhileC extends SentenciaC {
    public String condicion;
    public List<SentenciaC> sentencias;

    public BucleWhileC(String condicion, List<SentenciaC> sentencias) {
        this.condicion = condicion;
        this.sentencias = sentencias;
    }

    @Override
    public String generarCodigo(int nivel) {
       return "";
    }
}