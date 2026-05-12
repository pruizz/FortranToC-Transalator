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

        // La etiqueta del caso (ej. case 1: o case 1 to 5:)
        sb.append(ComponenteC.tab(nivel)).append(etiquetas).append("\n");

        // Las sentencias de dentro, con un nivel más de tabulación
        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }

        // El enunciado exige que siempre termine en break;
        sb.append(ComponenteC.tab(nivel + 1)).append("break;\n");

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