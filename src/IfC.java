import java.util.List;

public class IfC extends SentenciaC {
    public String condicion;
    public List<SentenciaC> sentenciasIf;
    public List<SentenciaC> sentenciasElse;

    public IfC(String condicion, List<SentenciaC> sentenciasIf, List<SentenciaC> sentenciasElse) {
        this.condicion = condicion;
        this.sentenciasIf = sentenciasIf;
        this.sentenciasElse = sentenciasElse;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}