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
        // Truco: Si el tipo es char[10], separamos el char por un lado y el [10] por otro
        if (tipoBase != null && tipoBase.startsWith("char[")) {
            tipo = "char";
            dim = tipoBase.substring(4);
        }

        // Lo imprimimos en orden: char nombre[10]
        sb.append(ComponenteC.tab(nivel)).append(tipo).append(" ").append(nombre).append(dim);

        if (valorInicial != null && !valorInicial.isEmpty()) {
            sb.append(" = ").append(valorInicial);
        }
        sb.append(";");
        return sb.toString();
    }
}