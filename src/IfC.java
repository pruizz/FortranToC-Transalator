import java.util.ArrayList;
import java.util.List;

public class IfC extends SentenciaC {
    public String condicion;
    public List<SentenciaC> bloqueThen = new ArrayList<>();
    public List<SentenciaC> bloqueElse = new ArrayList<>(); // Opcional

    @Override
    public String generarCodigo(int nivel) {
       return "";
    }
}