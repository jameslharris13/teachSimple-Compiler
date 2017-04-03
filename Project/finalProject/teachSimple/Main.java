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
        inputFile = "C:\\Users\\James\\Desktop\\Project\\finalProject\\sample1.txt";
        if (inputFile != null) {
            System.out.println("// source file is " + inputFile);
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
           

            //System.out.println(tree.toStringTree());
            traverseTree(tree);
            System.out.println("Enter term you wish to find:");
            Scanner scannerin = new java.util.Scanner(System.in);
            String searchItem = scannerin.nextLine();
            searchTree(tree, searchItem);
            System.out.println();

        } else {
            System.out.println("Usage: java pascal.Main <source>");
        }

    } // main method

    public static void traverseTree(Tree tree) 
    {

        System.out.println(tree.toString());
        int childCount = tree.getChildCount();
        if (childCount == 0) {

        } else {
            for (int i = 0; i < childCount; i++) {
                Tree child = tree.getChild(i);
                traverseTree(child);
            }
        }
    }
    
    public static void searchTree(Tree tree, String searchItem)
    {
        
        String Node = tree.toString();
        if (Node.equals(searchItem))
        {
            System.out.println("You have found the correct item.");
            System.out.println("The item from the parse tree is " + tree.toString());
        }
        if (tree.getChildCount() == 0)
        {
            
        }
        else
        {
            for (int i = 0; i < tree.getChildCount(); i++)
            {
                Tree child = tree.getChild(i);
                searchTree(child,searchItem);
            }
        }  
    }
} // class Main

