import java.util.List;

public class BucleForC extends SentenciaC {
    private String id, d1, d2, d3;
    private List<SentenciaC> sentencias;

    public BucleForC(String id, String d1, String d2, String d3, List<SentenciaC> sentencias) {
        this.id = id; this.d1 = d1; this.d2 = d2; this.d3 = d3; this.sentencias = sentencias;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append(tab(nivel)).append("for(").append(id).append("=").append(d1).append("; ")
                .append(id).append("!=").append(d2).append("; ")
                .append(id).append("=").append(id).append("+").append(d3).append(") {\n");

        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }
        sb.append(tab(nivel)).append("}");
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public List<SentenciaC> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<SentenciaC> sentencias) {
        this.sentencias = sentencias;
    }
}