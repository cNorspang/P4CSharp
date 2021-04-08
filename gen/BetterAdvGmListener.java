// Generated from C:/Users/Norspang/RiderProjects/POTBAG/POTBAG/AntlrFiles\BetterAdvGm.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BetterAdvGmParser}.
 */
public interface BetterAdvGmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BetterAdvGmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BetterAdvGmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(BetterAdvGmParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(BetterAdvGmParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#locationsetup}.
	 * @param ctx the parse tree
	 */
	void enterLocationsetup(BetterAdvGmParser.LocationsetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#locationsetup}.
	 * @param ctx the parse tree
	 */
	void exitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#locationmapping}.
	 * @param ctx the parse tree
	 */
	void enterLocationmapping(BetterAdvGmParser.LocationmappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#locationmapping}.
	 * @param ctx the parse tree
	 */
	void exitLocationmapping(BetterAdvGmParser.LocationmappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BetterAdvGmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BetterAdvGmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BetterAdvGmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BetterAdvGmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BetterAdvGmParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BetterAdvGmParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BetterAdvGmParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BetterAdvGmParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#text_statement}.
	 * @param ctx the parse tree
	 */
	void enterText_statement(BetterAdvGmParser.Text_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#text_statement}.
	 * @param ctx the parse tree
	 */
	void exitText_statement(BetterAdvGmParser.Text_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void enterInput_statement(BetterAdvGmParser.Input_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void exitInput_statement(BetterAdvGmParser.Input_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(BetterAdvGmParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(BetterAdvGmParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#travel_statement}.
	 * @param ctx the parse tree
	 */
	void enterTravel_statement(BetterAdvGmParser.Travel_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#travel_statement}.
	 * @param ctx the parse tree
	 */
	void exitTravel_statement(BetterAdvGmParser.Travel_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#choice_statement}.
	 * @param ctx the parse tree
	 */
	void enterChoice_statement(BetterAdvGmParser.Choice_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#choice_statement}.
	 * @param ctx the parse tree
	 */
	void exitChoice_statement(BetterAdvGmParser.Choice_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#option_statment}.
	 * @param ctx the parse tree
	 */
	void enterOption_statment(BetterAdvGmParser.Option_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#option_statment}.
	 * @param ctx the parse tree
	 */
	void exitOption_statment(BetterAdvGmParser.Option_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#int_assign}.
	 * @param ctx the parse tree
	 */
	void enterInt_assign(BetterAdvGmParser.Int_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#int_assign}.
	 * @param ctx the parse tree
	 */
	void exitInt_assign(BetterAdvGmParser.Int_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void enterString_assign(BetterAdvGmParser.String_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void exitString_assign(BetterAdvGmParser.String_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#input_assign}.
	 * @param ctx the parse tree
	 */
	void enterInput_assign(BetterAdvGmParser.Input_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#input_assign}.
	 * @param ctx the parse tree
	 */
	void exitInput_assign(BetterAdvGmParser.Input_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#location_assign}.
	 * @param ctx the parse tree
	 */
	void enterLocation_assign(BetterAdvGmParser.Location_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#location_assign}.
	 * @param ctx the parse tree
	 */
	void exitLocation_assign(BetterAdvGmParser.Location_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(BetterAdvGmParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(BetterAdvGmParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(BetterAdvGmParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#location_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocation_declaration(BetterAdvGmParser.Location_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#location_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocation_declaration(BetterAdvGmParser.Location_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetterAdvGmParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(BetterAdvGmParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetterAdvGmParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(BetterAdvGmParser.PredicateContext ctx);
}