public class AsignacionC extends SentenciaC {
    private String variable, valor;
    private boolean esReturn = false;

    public AsignacionC(String variable, String valor) {
        this.variable = variable; this.valor = valor;
    }

    @Override
    public String generarCodigo(int nivel) {
        if (esReturn) {
            return tab(nivel) + "return " + valor + ";";
        }
        return tab(nivel) + variable + " = " + valor + ";";
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public boolean isEsReturn() {
        return esReturn;
    }

    public void setEsReturn(boolean esReturn) {
        this.esReturn = esReturn;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}