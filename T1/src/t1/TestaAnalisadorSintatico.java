package t1;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        FileReader inputTestCase = new FileReader(inputFilePath);
        
        ANTLRInputStream input = new ANTLRInputStream(inputTestCase);
        LALexer lexer = new LALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LAParser parser = new LAParser(tokens);
        
        SaidaParser out = new SaidaParser();
        T1ErrorListener e = new T1ErrorListener(out);
        parser.addErrorListener(e);
        
        parser.programa();

        PrintWriter outputTestCase = new PrintWriter(outputFilePath, "UTF-8");
        outputTestCase.print(out.toString());
        outputTestCase.close();
        
    }
}