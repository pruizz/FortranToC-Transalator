import org.antlr.v4.runtime.*;

import java.io.IOException;

/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Numbers por el nombre del fichero que contiene la especificación de la gramática ANTLR
(extensión .g4)
*/
public class Translator {
    public static void main(String[] args) {
        try{
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de
            // entrada
            TranslatorLexer analex = new TranslatorLexer(input);
            // Identificar al analizador léxico como fuente de tokens para el
            // sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
            // Crear el objeto correspondiente al analizador sintáctico
            TranslatorParser anasint = new TranslatorParser(tokens);

            /*
            Si se quiere pasar al analizador algún objeto externo con el que trabajar,
            este deberá ser de una clase del mismo paquete
            Aquí se le llama "sintesis", pero puede ser cualquier nombre.
            NumbersParser anasint = new NumbersParser(tokens, new sintesis());
            */
            /*
            Comenzar el análisis llamando al axioma de la gramática
            Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
            gramática
            */
            anasint.prg();
        } catch (RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}