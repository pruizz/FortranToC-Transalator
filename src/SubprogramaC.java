import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubprogramaC extends ComponenteC{

    private String nombre;
    private String tipoRetorno; // "void" si es SUBROUTINE, otro si es FUNCTION
    private List<ParametroC> parametros = new ArrayList<>();
    private List<VariableC> variables = new ArrayList<>();
    private List<SentenciaC> sentencias = new ArrayList<>();
    private int parametrosProcesados = 0;

    public SubprogramaC(String nombre, String tipoRetorno) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
    }

    public String generarCabecera() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipoRetorno).append(" ").append(nombre).append(" (");

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
        sb.append(tab(nivel)).append(generarCabecera()).append(" {\n");

        for (VariableC v : variables) {
            sb.append(v.generarCodigo(nivel + 1)).append("\n");
        }
        for (SentenciaC s : sentencias) {
            s.setNombreFuncionPadre(this.nombre);
            sb.append(s.generarCodigo(nivel + 1)).append("\n");
        }

        sb.append(tab(nivel)).append("}");
        return sb.toString();
    }

    public boolean actualizarParametro(String nombre, String tipo, String modo) {
        if (parametrosProcesados >= parametros.size()) {
            return false;
        }
        ParametroC p = parametros.get(parametrosProcesados);

        if (!p.nombre.equals(nombre)) {
            return false;
        }
        p.tipo = tipo;
        p.modo = modo;
        parametrosProcesados++;
        return true;
    }
    public boolean comprobacionFinalParametros() {
        return parametrosProcesados == parametros.size();
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

    public List<SentenciaC> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<SentenciaC> sentencias) {
        this.sentencias = sentencias;
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

    public int getParametrosProcesados() {
        return parametrosProcesados;
    }

    public void setParametrosProcesados(int parametrosProcesados) {
        this.parametrosProcesados = parametrosProcesados;
    }
}


