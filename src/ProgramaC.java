import java.util.ArrayList;
import java.util.List;

public class ProgramaC extends ComponenteC {
    private List<ConstanteC> constantes = new ArrayList<>();
    private List<VariableC> variablesMain = new ArrayList<>();
    private List<SubprogramaC> interfaces = new ArrayList<>();
    private List<SentenciaC> sentenciasMain = new ArrayList<>();
    private List<SubprogramaC> implementaciones = new ArrayList<>();


    public List<ConstanteC> getConstantes() { return constantes; }
    public List<VariableC> getVariablesMain() { return variablesMain; }
    public List<SubprogramaC> getInterfaces() { return interfaces; }
    public List<SentenciaC> getSentenciasMain() { return sentenciasMain; }
    public List<SubprogramaC> getImplementaciones() { return implementaciones; }

    @Override
    public String generarCodigo(int nivel) {
        StringBuilder sb = new StringBuilder();

        // Cabeceras de C
        sb.append("#include <stdio.h>\n");
        sb.append("#include <stdlib.h>\n\n");

        // 1. Constantes globales (#define)
        for (ConstanteC c : constantes) {
            sb.append(c.generarCodigo(0)).append("\n");
        }
        if (!constantes.isEmpty()) sb.append("\n");

        // 2. Prototipos de funciones [cite: 206]
        for (SubprogramaC p : interfaces) {
            sb.append(p.generarCodigoCabecera()).append(";\n");
        }
        if (!interfaces.isEmpty()) sb.append("\n");

        // 3. Implementaciones
        for (SubprogramaC impl : implementaciones) {
            sb.append(impl.generarCodigo(0)).append("\n\n");
        }

        // 4. MAIN
        sb.append("void main (void) {\n");
        for (VariableC v : variablesMain) {
            sb.append(v.generarCodigo(1)).append("\n");
        }
        if (!variablesMain.isEmpty()) sb.append("\n");

        for (SentenciaC s : sentenciasMain) {
            sb.append(s.generarCodigo(1)).append("\n");
        }
        sb.append("}\n");

        return sb.toString();
    }

    public void setConstantes(List<ConstanteC> constantes) {
        this.constantes = constantes;
    }

    public void setVariablesMain(List<VariableC> variablesMain) {
        this.variablesMain = variablesMain;
    }

    public void setSentenciasMain(List<SentenciaC> sentenciasMain) {
        this.sentenciasMain = sentenciasMain;
    }

    public void setInterfaces(List<SubprogramaC> interfaces) {
        this.interfaces = interfaces;
    }

    public void setImplementaciones(List<SubprogramaC> implementaciones) {
        this.implementaciones = implementaciones;
    }
}