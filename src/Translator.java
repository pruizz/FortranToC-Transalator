import org.antlr.v4.runtime.*;

import java.io.File;
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


            String codigoGenerado = anasint.prg().codigoC;

            // Si el código no es nulo y no hay errores de sintaxis
            if (anasint.getNumberOfSyntaxErrors() == 0 && codigoGenerado != null) {

                File inFile = new File(archivoEntrada);
                String nombreArchivo = inFile.getName();
                String directorio = inFile.getParent();


                int dotIndex = nombreArchivo.lastIndexOf('.');
                String baseName = (dotIndex == -1) ? nombreArchivo : nombreArchivo.substring(0, dotIndex);
                String outFileName = baseName + ".c";

                File outFile = (directorio != null) ? new File(directorio, outFileName) : new File(outFileName);
                String archivoSalida = outFile.getPath();

                try (PrintWriter out = new PrintWriter(archivoSalida)) {
                    out.print(codigoGenerado);
                }

                System.out.println("Traducción completada con éxito.");
                System.out.println("Archivo generado: " + archivoSalida);
            } else {
                System.err.println("\nSe detectaron errores. No se ha generado el código C de salida.");
            }

        } catch (IOException e) {
            System.err.println("IO Error: No se pudo leer el archivo. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}