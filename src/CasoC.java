import java.util.List;

public class CasoC {
    public String etiquetas;
    public List<SentenciaC> sentencias;

    public CasoC(String etiquetas, List<SentenciaC> sentencias) {
        this.etiquetas = etiquetas;
        this.sentencias = sentencias;
    }

    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();

        sb.append(SentenciaC.tab(nivel)).append(etiquetas).append("\n");
        // Imprimimos sus sentencias
        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }
        // El enunciado dice que todos los case terminan en break;
        sb.append(SentenciaC.tab(nivel + 1)).append("break;\n");
        return sb.toString();
    }
}