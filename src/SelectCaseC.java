import java.util.List;

public class SelectCaseC extends SentenciaC {
    public String expresion;
    public List<CasoC> casos;
    public List<SentenciaC> sentDefault;

    public SelectCaseC(String expresion, List<CasoC> casos, List<SentenciaC> sentDefault) {
        this.expresion = expresion;
        this.casos = casos;
        this.sentDefault = sentDefault;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append(tab(nivel)).append("switch (").append(expresion).append(") {\n");

        for (CasoC c : casos) {
            sb.append(c.generarCodigo(nivel));
        }

        if (sentDefault != null && !sentDefault.isEmpty()) {
            sb.append(tab(nivel)).append("default:\n");
            for (SentenciaC s : sentDefault) {
                sb.append(s.generarCodigo(nivel + 1)).append("\n");
            }
        }

        sb.append(tab(nivel)).append("};");
        return sb.toString();
    }
}