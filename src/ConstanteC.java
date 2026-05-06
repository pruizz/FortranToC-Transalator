public class ConstanteC extends ComponenteC {

    public String tipo;
    public String nombre;
    public String valor;

    public ConstanteC(String tipo, String nombre, String valor) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String generarCodigo(int nivel) {

        return "#define " + nombre + " " + valor;

        /*
         * NOTA: Si tu profesor os ha especificado explícitamente que
         * quiere que se traduzcan como variables constantes de C,
         * entonces comenta el return de arriba y usa este:
         *
         * return tab(nivel) + "const " + tipo + " " + nombre + " = " + valor + ";";
         */
    }
}