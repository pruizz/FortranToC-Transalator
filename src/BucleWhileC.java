import java.util.List;

public class BucleWhileC extends SentenciaC {
    private String condicion;
    private List<SentenciaC> sentencias;

    public BucleWhileC(String condicion, List<SentenciaC> sentencias) {
        this.condicion = condicion;
        this.sentencias = sentencias;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();

        sb.append(ComponenteC.tab(nivel)).append("while (").append(condicion).append(") {\n");

        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }

        sb.append(ComponenteC.tab(nivel)).append("}");
        return sb.toString();
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public List<SentenciaC> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<SentenciaC> sentencias) {
        this.sentencias = sentencias;
    }
}