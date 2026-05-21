import java.util.List;

public class CasoC extends ComponenteC {
    private String etiquetas; // Ya viene formateado desde ANTLR (ej: "case 1:")
    private List<SentenciaC> sentencias;

    public CasoC(String etiquetas, List<SentenciaC> sentencias) {
        this.etiquetas = etiquetas;
        this.sentencias = sentencias;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();
        String tab = ComponenteC.tab(nivel);
        String tabCuerpo = ComponenteC.tab(nivel + 1);

        String etiquetasIndentadas = this.etiquetas.replace("\n", "\n" + tab);
        sb.append(tab).append(etiquetasIndentadas).append("\n");

        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }
        sb.append(tabCuerpo).append("break;\n");
        return sb.toString();
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<SentenciaC> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<SentenciaC> sentencias) {
        this.sentencias = sentencias;
    }
}