public abstract class ComponenteC {

    public abstract String generarCodigo(int nivel);

    protected String tab(int nivel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }
}