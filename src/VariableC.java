public class VariableC extends ComponenteC {
    public String tipoBase;
    public String nombre;
    public String valorInicial;

    public VariableC(String tipoBase, String nombre, String valorInicial) {
        this.tipoBase = tipoBase;
        this.nombre = nombre;
        this.valorInicial = valorInicial;
    }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();

        String tipo = tipoBase;
        String dim = "";
        if (tipoBase != null && tipoBase.startsWith("char[")) {
            tipo = "char";
            dim = tipoBase.substring(4);
        }

        sb.append(ComponenteC.tab(nivel)).append(tipo).append(" ").append(nombre).append(dim);

        if (valorInicial != null && !valorInicial.isEmpty()) {
            sb.append(" = ").append(valorInicial);
        }
        sb.append(";");
        return sb.toString();
    }
}