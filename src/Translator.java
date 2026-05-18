import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Translator {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Error: Indica la ruta del archivo .for");
            return;
        }

        String archivoEntrada = args[0];

        try {
            CharStream input = CharStreams.fromFileName(archivoEntrada);
            TranslatorLexer analex = new TranslatorLexer(input);

            ManejadorErrores manejador = new ManejadorErrores();
            analex.removeErrorListeners();
            analex.addErrorListener(manejador);

            CommonTokenStream tokens = new CommonTokenStream(analex);
            TranslatorParser anasint = new TranslatorParser(tokens);

            anasint.removeErrorListeners();
            anasint.addErrorListener(manejador);

            // Ejecutamos la regla prg y guardamos el código C que nos devuelve
            String codigoGenerado = anasint.prg().codigoC;

            // Si el código no es nulo (es decir, si no hubo errores que pararan la traducción)
            if (anasint.getNumberOfSyntaxErrors() == 0 && codigoGenerado != null) {
                String archivoSalida = archivoEntrada.replaceAll("(?i)\\.for$", ".c");

                try (PrintWriter out = new PrintWriter(archivoSalida)) {
                    out.print(codigoGenerado);
                }

                System.out.println("Traducción completada con éxito.");
                System.out.println("Archivo generado: " + archivoSalida);
            } else {
                System.err.println("\nSe detectaron errores. No se ha generado el código C de salida.");
            }

        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}