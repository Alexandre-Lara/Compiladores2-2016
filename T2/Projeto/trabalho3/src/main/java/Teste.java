package main.java;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by alexandre on 19/12/16.
 */

public class Teste {

    public static void main(String args[]) throws IOException, RecognitionException {
        String inputFilePath = "/home/alexandre/Documents/Compiladores2-2016/T2/Projeto/Testes/casosTesteParaApresentacao.tatxt";//args[0];
        //String outputFilePath = args[1];

        FileReader inputTestCase = new FileReader(inputFilePath);

        ANTLRInputStream input = new ANTLRInputStream(inputTestCase);
        matematicaLexer lexer = new matematicaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        matematicaParser parser = new matematicaParser(tokens);

        VisitorMatematica v = new VisitorMatematica();
        matematicaParser.ProgramaContext arvore = parser.programa();
        v.visitPrograma(arvore);
    }
}