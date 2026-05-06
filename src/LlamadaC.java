import java.util.List;

public class LlamadaC extends SentenciaC {
    public String nombreProcedimiento;
    public List<String> argumentos;

    public LlamadaC(String nombre, List<String> args) {
        this.nombreProcedimiento = nombre;
        this.argumentos = args;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}