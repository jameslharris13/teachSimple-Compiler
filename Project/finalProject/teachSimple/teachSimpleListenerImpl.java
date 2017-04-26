package teachSimple;

import java.util.ArrayDeque;
import org.stringtemplate.v4.*;
import java.io.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import java.util.List;
import java.util.ArrayList;


class teachSimpleListenerImpl extends teachSimpleBaseListener {
		
    STGroup stg = new STGroupFile("./JavaScript.stg");

    @Override
    public void enterProgram(teachSimpleParser.ProgramContext ctx) {
        String programName = ctx.programName().getChild(1).getText();
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
        ST st = stg.getInstanceOf("enterFunctionDeclaration");
		String name = ctx.getChild(1).getText();
		
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
        String functionName = ctx.getChild(0).getText();
        List<ParseTree> values = ctx.children;
        ArrayList params = new ArrayList<String>();
		
        ST st = stg.getInstanceOf("funcCall");
        for (int i = 0; i < ctx.getChildCount(); i += 1) {
            params.add(values.get(i).getText());
        }

        st.add("v", functionName);
        st.add("values", params);
        System.out.println(st.render());
    }
    
    @Override 
    public void exitFunctionDesignator(teachSimpleParser.FunctionDesignatorContext ctx) 
    { 
        ST st = stg.getInstanceOf("exitFunctionDesignator");
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
            st.add("symbol", "<");
            System.out.println(st.render());
        } else {
            ST st = stg.getInstanceOf("enterForLoopDown");
            st.add("variable", counterVariable);
            st.add("from", from);
            st.add("to", to);
            st.add("symbol", "<");
            System.out.println(st.render());
        }
    }
	
	@Override
	public void enterLoopRepeatStatement(teachSimpleParser.LoopRepeatStatementContext ctx)
	{
		String iterations = ctx.getChild(1).getText();
		iterations = iterations.substring(0, Math.min(iterations.length(), 1));
		String cond =  "int i = 0; i <";
		ST st = stg.getInstanceOf("enterLoopRepeatStatement");
		st.add("cond",cond);
		st.add("variable", iterations);
		System.out.println(st.render());
		
	}
	@Override
	public void exitLoopRepeatStatement(teachSimpleParser.LoopRepeatStatementContext ctx)
	{
		ST st = stg.getInstanceOf("exitLoopRepeatStatement");
		System.out.println(st.render());
	}
	
	
	@Override
	public void enterRepeatStatement(teachSimpleParser.RepeatStatementContext ctx)
	{
		String compare = ctx.getChild(3).getText();
		ST st = stg.getInstanceOf("enterRepeatStatement");
		st.add("variable", compare);
		System.out.println(st.render());
	}
	
	@Override
	public void exitRepeatStatement(teachSimpleParser.RepeatStatementContext ctx)
	{
		ST st = stg.getInstanceOf("exitRepeatStatement");
		System.out.println(st.render());
	}
	
	 @Override
    public void enterWhileStatement(teachSimpleParser.WhileStatementContext ctx) {
        String compare = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("enterWhileLoop");
        st.add("variable", compare);
        System.out.print(st.render());
    }

    @Override
    public void exitForStatement(teachSimpleParser.ForStatementContext ctx) {
        ST st = stg.getInstanceOf("exitForLoop");
        System.out.println(st.render());

    }
	
	@Override
	public void enterIncrementStatement(teachSimpleParser.IncrementStatementContext ctx)
	{
		String start = ctx.getChild(0).getText();
		String symbol = ctx.getChild(1).getText();
		String symbol2 = ctx.getChild(2).getText();
		String result = start + symbol + symbol2;
		ST st = stg.getInstanceOf("enterIncrementStatement");
        st.add("r", result);
        System.out.println(st.render());
	}

    @Override
    public void enterIfStatement(teachSimpleParser.IfStatementContext ctx) {
        String comp = ctx.getChild(1).getText();
		String numberCase = ctx.getChild(4).getText();
        ST st = stg.getInstanceOf("enterIfStatement");
        st.add("v", comp);
        System.out.println(st.render());
    }
	
	@Override
	public void enterSwitchStatement(teachSimpleParser.SwitchStatementContext ctx) {
		List<ParseTree> values = ctx.children;
        ArrayList params = new ArrayList<String>();
		
		String caseStatement = ctx.getChild(1).getText();
		 for (int i = 4; i < ctx.getChildCount(); i += 4) {
			 params.add(values.get(i).getText());
		 }
		ST st = stg.getInstanceOf("enterSwitchStatement");
		st.add("v", caseStatement);
		st.add("params", params);
		System.out.println(st.render());
	}
	
	@Override
	public void exitSwitchStatement(teachSimpleParser.SwitchStatementContext ctx) {
		ST st = stg.getInstanceOf("exitSwitchStatement");
        System.out.println(st.render());
	}
	
    @Override
    public void exitIfStatement(teachSimpleParser.IfStatementContext ctx) {
        ST st = stg.getInstanceOf("exitIfStatement");
        System.out.println(st.render());
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
            params.add(ctx.getChild(1).getChild(0).getChild(i).getText());
        }
		if (stg.getName().equals("CPlusPlus"))
		{
			String variableType = ctx.getChild(1).getChild(2).getChild(0).getText();
			st.add("type", variableType);
		}
		st.add("variables", params);
        System.out.println(st.render());
    }
	
	@Override
	public void enterConstantDefinition(teachSimpleParser.ConstantDefinitionContext ctx){
		String identifier = ctx.getChild(0).getText() + " "+ ctx.getChild(1).getText();
		String value = ctx.getChild(2).getText();
		ST st = stg.getInstanceOf("enterConstantDeclaration");
		
		if (stg.getName().equals("CPlusPlus"))
		{
			String type = ctx.getChild(4).getText();
			st.add("type", type);
		}
		st.add("identifier", identifier);
		st.add("value", value);
		System.out.println(st.render());
	}
	
	@Override
	public void enterFunctionStatement(teachSimpleParser.FunctionStatementContext ctx) {
		String name = ctx.getChild(0).getText();
		String bracket = ctx.getChild(1).getText();
		String param = ctx.getChild(2).getText();
		String closingBracket = ctx.getChild(3).getText();
		String parameters = bracket + param + closingBracket;
		ST st = stg.getInstanceOf("enterFunctionStatement");
		st.add("name", name);
		st.add("parameters", parameters);
		System.out.println(st.render());
	}
	
	@Override
	public void enterTypeDefinitionPart(teachSimpleParser.TypeDefinitionPartContext ctx) {
		
		//Getting size of array
		String size = ctx.getChild(1).getChild(2).getChild(0).getChild(0).getChild(0).getChild(2).getText();
		
		//Getting name of array
		String name = ctx.getChild(1).getChild(0).getText();
		
		//String[] split;
		//split = size.split("\\[");
		//split = split[1].split("\\]");
		
		ST st = stg.getInstanceOf("typeDeclaration");
		
		if (stg.getName().equals("CPlusPlus"))
		{
			//Getting array type
			String type = ctx.getChild(1).getChild(2).getChild(0).getChild(0).getChild(0).getChild(5).getText();
			st.add("type", type);
		}
		//Printing out string template
		st.add("name", name);
		st.add("size", size);
		System.out.println(st.render());
	}
	
	@Override
	public void enterCommentStatement(teachSimpleParser.CommentStatementContext ctx) {
		String comment = ctx.getChild(1).getText();
		String concat = comment + " " + ctx.getChild(2).getText();
		//Printing out string template
		ST st = stg.getInstanceOf("comment");
		st.add("value", concat);
		System.out.println(st.render());
	}
} // class myListener
