import org.antlr.v4.runtime.*;
import java.io.IOException;

public class Translator {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Error: Indica la ruta del archivo .for");
            return;
        }

        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            TranslatorLexer analex = new TranslatorLexer(input);

            ManejadorErrores manejador = new ManejadorErrores();
            analex.removeErrorListeners();
            analex.addErrorListener(manejador);

            CommonTokenStream tokens = new CommonTokenStream(analex);
            TranslatorParser anasint = new TranslatorParser(tokens);

            anasint.removeErrorListeners();
            anasint.addErrorListener(manejador);

            anasint.prg();

        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}