public class AsignacionC extends SentenciaC {
    private String variable, valor;
    private boolean esReturn = false;
    private boolean esPuntero = false;

    public AsignacionC(String variable, String valor) {
        this.variable = variable; this.valor = valor;
    }

    @Override
    public String generarCodigo(int nivel) {
        String tab = ComponenteC.tab(nivel);

        if (esReturn) {
            return tab + "return " + valor + ";";
        }

        String izq = esPuntero ? "*" + variable : variable;

        return tab + izq + " = " + valor + ";";
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

    public boolean isEsPuntero() {
        return esPuntero;
    }

    public void setEsPuntero(boolean esPuntero) {
        this.esPuntero = esPuntero;
    }
}