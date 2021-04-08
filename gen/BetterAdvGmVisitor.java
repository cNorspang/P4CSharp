// Generated from C:/Users/Norspang/RiderProjects/POTBAG/POTBAG/AntlrFiles\BetterAdvGm.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BetterAdvGmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BetterAdvGmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BetterAdvGmParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(BetterAdvGmParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#locationsetup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#locationmapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationmapping(BetterAdvGmParser.LocationmappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BetterAdvGmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BetterAdvGmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BetterAdvGmParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BetterAdvGmParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#text_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_statement(BetterAdvGmParser.Text_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_statement(BetterAdvGmParser.Input_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(BetterAdvGmParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#travel_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTravel_statement(BetterAdvGmParser.Travel_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#choice_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_statement(BetterAdvGmParser.Choice_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#option_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_statment(BetterAdvGmParser.Option_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#int_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assign(BetterAdvGmParser.Int_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#string_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assign(BetterAdvGmParser.String_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#input_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_assign(BetterAdvGmParser.Input_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#location_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_assign(BetterAdvGmParser.Location_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(BetterAdvGmParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#location_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_declaration(BetterAdvGmParser.Location_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BetterAdvGmParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(BetterAdvGmParser.PredicateContext ctx);
}