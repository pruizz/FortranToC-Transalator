import java.util.ArrayList;
import java.util.List;

public class SubprogramaC extends ComponenteC {
    private String nombre, tipoRetorno;
    private List<ParametroC> parametros = new ArrayList<>();
    private List<VariableC> variables = new ArrayList<>();
    private List<SentenciaC> sentencias = new ArrayList<>();

    public SubprogramaC(String nombre, String tipoRetorno) {
        this.nombre = nombre; this.tipoRetorno = tipoRetorno;
    }

    public boolean actualizarParametro(String nombreParam, String tipo, String modo) {
        for (ParametroC p : parametros) {
            if (p.getNombre().equals(nombreParam)) {
                p.setTipo(tipo);
                p.setModo(modo);
                return true;
            }
        }
        return false;
    }

    public String generarCodigoCabecera() {
        StringBuilder sb = new StringBuilder();
        String t = (tipoRetorno == null || tipoRetorno.isEmpty()) ? "void" : tipoRetorno;

        if (t.startsWith("char")) {
            t = "char";
        }

        sb.append(t).append(" ").append(nombre).append("(");

        if (parametros.isEmpty()) {
            sb.append("void");
        } else {
            for (int i = 0; i < parametros.size(); i++) {
                sb.append(parametros.get(i).generarCodigo(0));
                if (i < parametros.size() - 1) sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();
        String tab = ComponenteC.tab(nivel);

        if (this.tipoRetorno != null && !this.tipoRetorno.equalsIgnoreCase("void")) {
            for (int i = this.sentencias.size() - 1; i >= 0; i--) {
                SentenciaC s = this.sentencias.get(i);
                if (s instanceof AsignacionC) {
                    AsignacionC asig = (AsignacionC) s;
                    if (asig.getVariable().equalsIgnoreCase(this.nombre)) {
                        asig.setEsReturn(true);
                        break;
                    }
                }
            }
        }

        String tCabecera = this.tipoRetorno;
        if (tCabecera != null && tCabecera.startsWith("char")) {
            tCabecera = "char";
        }

        sb.append(tab).append(tCabecera).append(" ").append(this.nombre).append("(");

        for (int i = 0; i < parametros.size(); i++) {
            sb.append(parametros.get(i).generarCodigo(0));
            if (i < parametros.size() - 1) sb.append(", ");
        }
        sb.append(") {\n");


        for (VariableC v : variables) {
            sb.append(v.generarCodigo(nivel + 1)).append("\n");
        }

        for (SentenciaC s : sentencias) {
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }

        sb.append(tab).append("}\n");
        return sb.toString();
    }

    public boolean esPuntero(String nombreVar) {
        for (ParametroC p : parametros) {
            if (p.getNombre().equalsIgnoreCase(nombreVar)) {
                String m = p.getModo();
                return "OUT".equalsIgnoreCase(m) || "INOUT".equalsIgnoreCase(m);
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public List<ParametroC> getParametros() {
        return parametros;
    }

    public void setParametros(List<ParametroC> parametros) {
        this.parametros = parametros;
    }

    public List<VariableC> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableC> variables) {
        this.variables = variables;
    }

    public List<SentenciaC> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<SentenciaC> sentencias) {
        this.sentencias = sentencias;
    }
}