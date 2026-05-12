import java.util.List;

public class SelectCaseC extends SentenciaC {
    private String expresion;
    private List<CasoC> casos;
    private List<SentenciaC> sentDefault;

    public SelectCaseC(String expresion, List<CasoC> casos, List<SentenciaC> sentDefault) {
        this.expresion = expresion;
        this.casos = casos;
        this.sentDefault = sentDefault;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();

        sb.append(ComponenteC.tab(nivel)).append("switch (").append(expresion).append(") {\n");

        for (CasoC c : casos) {
            sb.append(c.generarCodigo(nivel + 1));
        }

        // Imprimimos el default si lo hay
        if (sentDefault != null && !sentDefault.isEmpty()) {
            sb.append(ComponenteC.tab(nivel + 1)).append("default:\n");
            for (SentenciaC s : sentDefault) {
                sb.append(s.generarCodigo(nivel + 2)).append("\n");
            }
            sb.append(ComponenteC.tab(nivel + 2)).append("break;\n");
        }

        sb.append(ComponenteC.tab(nivel)).append("}");
        return sb.toString();
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public List<CasoC> getCasos() {
        return casos;
    }

    public void setCasos(List<CasoC> casos) {
        this.casos = casos;
    }

    public List<SentenciaC> getSentDefault() {
        return sentDefault;
    }

    public void setSentDefault(List<SentenciaC> sentDefault) {
        this.sentDefault = sentDefault;
    }
}