import org.antlr.v4.runtime.*;
import java.util.*;

public class ManejadorErrores extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {


        String causa = "Error de sintaxis";
        if (msg.contains("mismatched input")) causa = "Símbolo inesperado";
        else if (msg.contains("no viable alternative")) causa = "Estructura incompleta";
        else if (msg.contains("token recognition error")) causa = "Carácter no válido";

        System.err.println("--------------------------------------------------");
        System.err.println("Error en Línea " + line + ", Columna " + charPositionInLine);
        System.err.println("Causa: " + causa);
        System.err.println("Detalle: " + msg);

        markError(recognizer, (Token)offendingSymbol, line, charPositionInLine);
    }

    private void markError(Recognizer<?, ?> recognizer, Token offendingToken,
                                 int line, int charPositionInLine) {

        String input;
        //Necesario diferencias si es error lexico o del parser
        if (recognizer instanceof Parser) {
            TokenStream tokens = (TokenStream)recognizer.getInputStream();
            input = tokens.getTokenSource().getInputStream().toString();
        } else {
            input = recognizer.getInputStream().toString();
        }

        String[] lines = input.split("\n");


        if (line > 0 && line <= lines.length) {
            String errorLine = lines[line - 1];
            System.err.println(errorLine.replaceAll("\r", ""));

            for (int i = 0; i < charPositionInLine; i++) System.err.print(" ");

            if (offendingToken != null) {
                int start = offendingToken.getStartIndex();
                int stop = offendingToken.getStopIndex();
                if (start >= 0 && stop >= 0) {
                    for (int i = start; i <= stop; i++) System.err.print("^");
                }
            } else {
                System.err.print("^");
            }
            System.err.println();
        }
    }
}