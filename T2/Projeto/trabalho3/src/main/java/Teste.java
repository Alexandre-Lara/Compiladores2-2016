package main.java;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Created by alexandre on 19/12/16.
 */

public class Teste {

    public static void main(String args[]) throws IOException, RecognitionException {
        String inputFilePath = "/home/alexandre/Documents/Compiladores2-2016/T2/Projeto/Testes/casosTeste.txt";//args[0];
        //String outputFilePath = args[1];

        FileReader inputTestCase = new FileReader(inputFilePath);

        ANTLRInputStream input = new ANTLRInputStream(inputTestCase);
        matematicaLexer lexer = new matematicaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        matematicaParser parser = new matematicaParser(tokens);

        //SaidaParser out = new SaidaParser();
        //T1ErrorListener e = new T1ErrorListener(out);
        //parser.addErrorListener(e);
        VisitorMatematica v = new VisitorMatematica();
        matematicaParser.ProgramaContext arvore = parser.programa();
        v.visitPrograma(arvore);


        //PrintWriter outputTestCase = new PrintWriter(outputFilePath, "UTF-8");
        //outputTestCase.print(out.toString());
        //outputTestCase.close();

    }
}