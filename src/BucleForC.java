import java.util.List;

public class BucleForC extends SentenciaC {
    public String variable;
    public String valInicial;
    public String valLimite;
    public String incremento;
    public List<SentenciaC> sentencias;

    public BucleForC(String variable, String valInicial, String valLimite, String incremento, List<SentenciaC> sentencias) {
        this.variable = variable;
        this.valInicial = valInicial;
        this.valLimite = valLimite;
        this.incremento = incremento;
        this.sentencias = sentencias;
    }

    @Override
    public String generarCodigo(int nivel) {
       return "";
    }
}