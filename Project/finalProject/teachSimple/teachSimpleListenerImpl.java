package teachSimple;

import java.util.ArrayDeque;
import org.stringtemplate.v4.*;
import java.io.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import java.util.List;
import java.util.ArrayList;


class teachSimpleListenerImpl extends teachSimpleBaseListener {

    STGroup stg = new STGroupFile("./teachSimple.stg");
    String programName;

    @Override
    public void enterProgram(teachSimpleParser.ProgramContext ctx) {
        programName = ctx.programName().getChild(1).getText();
        ST st = stg.getInstanceOf("enterProgram");
        st.add("v", programName);
        System.out.println(st.render());
    }
	
	@Override
	public void exitProgram(teachSimpleParser.ProgramContext ctx) {
		ST st = stg.getInstanceOf("exitProgram");
        System.out.println(st.render());
	}

    @Override
    public void enterFunctionDeclaration(teachSimpleParser.FunctionDeclarationContext ctx) {
        ArrayList params = new ArrayList<String>();
        ST st = stg.getInstanceOf("enterFuncDeclaration");
        String name = ctx.getChild(1).getChild(0).getText();
        for (int i = 1; i < ctx.getChild(2).getChildCount(); i += 2) {
            String list[] = ctx.getChild(2).getChild(i).getText().split(",");
            params.add(list[0]); 
        }
        st.add("identifier", name);
        st.add("v", params);
        System.out.println(st.render());
    }

    @Override
    public void enterFunctionDesignator(teachSimpleParser.FunctionDesignatorContext ctx) {
        String procName = ctx.getChild(0).getText();

        List<ParseTree> values = ctx.children;
        ArrayList params = new ArrayList<String>();
        ST st = stg.getInstanceOf("funcCall");
        for (int i = 0; i < ctx.getChildCount(); i += 1) {
            params.add(values.get(i).getText());
        }

        st.add("v", procName);
        st.add("values", params);
        System.out.println(st.render());
    }
    
    @Override 
    public void exitFunctionDesignator(teachSimpleParser.FunctionDesignatorContext ctx) 
    { 
        ST st = stg.getInstanceOf("exitProcDeclaration");
        System.out.println(st.render());
    
    }

    @Override
    public void enterRead(teachSimpleParser.ReadContext ctx) {
        if (ctx.getChild(2) != null) {
            ST st = stg.getInstanceOf("input");
            String answer = ctx.getChild(2).getText();
            st.add("v", answer);
            System.out.println(st.render());
        } else {
            ST st = stg.getInstanceOf("emptyInput");
            System.out.println(st.render());
        }
    }

    @Override
    public void enterWrite(teachSimpleParser.WriteContext ctx) {
        if (ctx.getChild(1) != null) {
            ST st = stg.getInstanceOf("output");
            String answer = ctx.getChild(2).getText();
            st.add("v", answer);
            System.out.println(st.render());
        } else {
            ST st = stg.getInstanceOf("emptyOutput");
            System.out.println(st.render());
        }
    }
	@Override
	public void enterAssignmentStatement(teachSimpleParser.AssignmentStatementContext ctx){
		ST st = stg.getInstanceOf("assignmentStatement");
		String answer = ctx.getChild(0).getText();
		st.add("v", answer);
		String answer2= ctx.getChild(2).getText();
		st.add("w", answer2);
		System.out.println(st.render());
	}
	
	
	
	
	

    @Override
    public void enterForStatement(teachSimpleParser.ForStatementContext ctx) {
        String counterVariable = ctx.getChild(1).getText();
        String to = ctx.getChild(3).getChild(2).getText();
        String from = ctx.getChild(3).getChild(0).getText();
        if (ctx.getChild(3).getChild(1).getText().equals("TO")) {
            ST st = stg.getInstanceOf("enterForLoop");
            st.add("variable", counterVariable);
            st.add("from", from);
            st.add("to", to);
            st.add("symbol", ">");
            System.out.println(st.render());
        } else {
            ST st = stg.getInstanceOf("enterForLoopDown");
            st.add("variable", counterVariable);
            st.add("from", from);
            st.add("to", to);
            st.add("symbol", ">");
            System.out.println(st.render());
        }
    }

    @Override
    public void exitForStatement(teachSimpleParser.ForStatementContext ctx) {
        ST st = stg.getInstanceOf("exitForLoop");
        System.out.println(st.render());

    }

    @Override
    public void enterIfStatement(teachSimpleParser.IfStatementContext ctx) {
        String comp = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("enterIfStatement");
        st.add("v", comp);
        System.out.println(st.render());
    }

    @Override
    public void exitIfStatement(teachSimpleParser.IfStatementContext ctx) {
        ST st = stg.getInstanceOf("exitIfStatement");
        System.out.println(st.render());
    }

    @Override
    public void enterWhileStatement(teachSimpleParser.WhileStatementContext ctx) {
        String compare = ctx.getChild(3).getText();
        if (compare.compareTo("=") == 0) {
            compare = "==";
        }
        ST st = stg.getInstanceOf("enterWhileLoop");
        st.add("variable", ctx.getChild(2).getText());
        st.add("symbol", compare);
        st.add("w", ctx.getChild(4).getText());
        System.out.print(st.render().trim());
    }

    @Override
    public void exitWhileStatement(teachSimpleParser.WhileStatementContext ctx) {
        ST st = stg.getInstanceOf("exitWhileLoop");
        System.out.println(st.render());
    }

    @Override
    public void enterVariableDeclarationPart(teachSimpleParser.VariableDeclarationPartContext ctx) {
        ArrayList params = new ArrayList<String>();
        ST st = stg.getInstanceOf("variableDeclaration");
        for (int i = 0; i < ctx.getChild(1).getChild(0).getChildCount(); i += 2) {
            //System.out.println(ctx.getChild(1).getChild(0).getChild(i).getText());
            params.add(ctx.getChild(1).getChild(0).getChild(i).getText());
        }
        st.add("variables", params);
        //st.add("values", params);
        System.out.println(st.render());
    }
} // class myListener
