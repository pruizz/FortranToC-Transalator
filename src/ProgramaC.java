import java.util.ArrayList;
import java.util.List;

public class ProgramaC extends ComponenteC{

    public List<ConstanteC> constantes = new ArrayList<>();
    //Interfaces INTERFACE
    public List<SubprogramaC> interfaces = new ArrayList<>();
    public List<SubprogramaC> implementaciones = new ArrayList<>();

    // Variables y sentencias del programa principal (PROGRAM -> main)
    public List<VariableC> variablesMain = new ArrayList<>();
    public List<SentenciaC> sentenciasMain = new ArrayList<>();


    @Override
    public String generarCodigo(int nivel) {
        return "";
    }
}
