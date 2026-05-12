import java.util.List;

public class IfC extends SentenciaC {
    private String condicion;
    private List<SentenciaC> sentenciasIf, sentenciasElse;

    public IfC(String condicion, List<SentenciaC> sIf, List<SentenciaC> sElse) {
        this.condicion = condicion; this.sentenciasIf = sIf; this.sentenciasElse = sElse;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append(tab(nivel)).append("if (").append(condicion).append(") {\n");

        for (SentenciaC s : sentenciasIf) sb.append(s.generarCodigo(nivel + 1)).append("\n");
        sb.append(tab(nivel)).append("}");

        if (sentenciasElse != null && !sentenciasElse.isEmpty()) {
            sb.append(" else {\n");
            for (SentenciaC s : sentenciasElse) sb.append(s.generarCodigo(nivel + 1)).append("\n");
            sb.append(tab(nivel)).append("}");
        }
        return sb.toString();
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public List<SentenciaC> getSentenciasElse() {
        return sentenciasElse;
    }

    public void setSentenciasElse(List<SentenciaC> sentenciasElse) {
        this.sentenciasElse = sentenciasElse;
    }

    public List<SentenciaC> getSentenciasIf() {
        return sentenciasIf;
    }

    public void setSentenciasIf(List<SentenciaC> sentenciasIf) {
        this.sentenciasIf = sentenciasIf;
    }
}