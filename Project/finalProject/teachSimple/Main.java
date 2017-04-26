package teachSimple;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;

class Main {

    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        inputFile = "C:\\Users\\James\\Desktop\\Project\\finalProject\\sample7.txt";
        if (inputFile != null) {
            is = new FileInputStream(inputFile);

            ANTLRInputStream input = new ANTLRInputStream(is);

            teachSimpleLexer lexer = new teachSimpleLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            teachSimpleParser parser = new teachSimpleParser(tokens);

            //teachSimpleBaseListener Walker
            ParseTree tree = parser.program();
            teachSimpleListenerImpl ml = new teachSimpleListenerImpl();
            
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(ml, tree);
            
            
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewr = new TreeViewer(Arrays.asList(
              parser.getRuleNames()), tree);
            viewr.setScale(1);//scale a little
            panel.add(viewr);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);
            frame.setVisible(true);
        
        } else {
            System.out.println("Usage: java teachSimple.Main <source>");
        }

    } // main method
} // class Main

