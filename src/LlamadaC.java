import java.util.List;

public class LlamadaC extends SentenciaC {
    public String nombreProcedimiento;
    public String argumentos;  //Vienen todos los argumentos en un string largo;

    public LlamadaC(String nombre, String args) {
        this.nombreProcedimiento = nombre;
        this.argumentos = args;
    }

    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}