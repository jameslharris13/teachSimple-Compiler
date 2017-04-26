// Generated from teachSimple.g4 by ANTLR 4.6
package teachSimple;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link teachSimpleParser}.
 */
public interface teachSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(teachSimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(teachSimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(teachSimpleParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(teachSimpleParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(teachSimpleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(teachSimpleParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(teachSimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(teachSimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(teachSimpleParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(teachSimpleParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(teachSimpleParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(teachSimpleParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(teachSimpleParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(teachSimpleParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(teachSimpleParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(teachSimpleParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(teachSimpleParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(teachSimpleParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(teachSimpleParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(teachSimpleParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(teachSimpleParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(teachSimpleParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(teachSimpleParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(teachSimpleParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(teachSimpleParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(teachSimpleParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(teachSimpleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(teachSimpleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(teachSimpleParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(teachSimpleParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(teachSimpleParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(teachSimpleParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(teachSimpleParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(teachSimpleParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(teachSimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(teachSimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(teachSimpleParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(teachSimpleParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(teachSimpleParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(teachSimpleParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(teachSimpleParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(teachSimpleParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(teachSimpleParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(teachSimpleParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(teachSimpleParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(teachSimpleParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(teachSimpleParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(teachSimpleParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(teachSimpleParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(teachSimpleParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(teachSimpleParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(teachSimpleParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(teachSimpleParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(teachSimpleParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(teachSimpleParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(teachSimpleParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(teachSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(teachSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(teachSimpleParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(teachSimpleParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(teachSimpleParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(teachSimpleParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(teachSimpleParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(teachSimpleParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(teachSimpleParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(teachSimpleParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(teachSimpleParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(teachSimpleParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(teachSimpleParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(teachSimpleParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(teachSimpleParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(teachSimpleParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(teachSimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(teachSimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(teachSimpleParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(teachSimpleParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(teachSimpleParser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(teachSimpleParser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(teachSimpleParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(teachSimpleParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(teachSimpleParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(teachSimpleParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(teachSimpleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(teachSimpleParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(teachSimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(teachSimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(teachSimpleParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(teachSimpleParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(teachSimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(teachSimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(teachSimpleParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(teachSimpleParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(teachSimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(teachSimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(teachSimpleParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(teachSimpleParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(teachSimpleParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(teachSimpleParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(teachSimpleParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(teachSimpleParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(teachSimpleParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(teachSimpleParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(teachSimpleParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(teachSimpleParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(teachSimpleParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(teachSimpleParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(teachSimpleParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(teachSimpleParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(teachSimpleParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(teachSimpleParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(teachSimpleParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(teachSimpleParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(teachSimpleParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(teachSimpleParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(teachSimpleParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(teachSimpleParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(teachSimpleParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(teachSimpleParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(teachSimpleParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(teachSimpleParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(teachSimpleParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(teachSimpleParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(teachSimpleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(teachSimpleParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(teachSimpleParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(teachSimpleParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(teachSimpleParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(teachSimpleParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(teachSimpleParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(teachSimpleParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(teachSimpleParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(teachSimpleParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(teachSimpleParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(teachSimpleParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#loopRepeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopRepeatStatement(teachSimpleParser.LoopRepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#loopRepeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopRepeatStatement(teachSimpleParser.LoopRepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(teachSimpleParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(teachSimpleParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(teachSimpleParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(teachSimpleParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(teachSimpleParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(teachSimpleParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(teachSimpleParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(teachSimpleParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(teachSimpleParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(teachSimpleParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(teachSimpleParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(teachSimpleParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(teachSimpleParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(teachSimpleParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teachSimpleParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncrementStatement(teachSimpleParser.IncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teachSimpleParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncrementStatement(teachSimpleParser.IncrementStatementContext ctx);
}