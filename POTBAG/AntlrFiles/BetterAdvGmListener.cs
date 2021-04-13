//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from BetterAdvGm.g4 by ANTLR 4.9.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="BetterAdvGmParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.1")]
[System.CLSCompliant(false)]
public interface IBetterAdvGmListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProg([NotNull] BetterAdvGmParser.ProgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProg([NotNull] BetterAdvGmParser.ProgContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.buffernode"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBuffernode([NotNull] BetterAdvGmParser.BuffernodeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.buffernode"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBuffernode([NotNull] BetterAdvGmParser.BuffernodeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.setup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSetup([NotNull] BetterAdvGmParser.SetupContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.setup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSetup([NotNull] BetterAdvGmParser.SetupContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.locationsetup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocationsetup([NotNull] BetterAdvGmParser.LocationsetupContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.locationsetup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocationsetup([NotNull] BetterAdvGmParser.LocationsetupContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.locationmapping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocationmapping([NotNull] BetterAdvGmParser.LocationmappingContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.locationmapping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocationmapping([NotNull] BetterAdvGmParser.LocationmappingContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.inBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInBlock([NotNull] BetterAdvGmParser.InBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.inBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInBlock([NotNull] BetterAdvGmParser.InBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] BetterAdvGmParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] BetterAdvGmParser.ExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] BetterAdvGmParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] BetterAdvGmParser.StatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssign([NotNull] BetterAdvGmParser.AssignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssign([NotNull] BetterAdvGmParser.AssignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeclaration([NotNull] BetterAdvGmParser.DeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeclaration([NotNull] BetterAdvGmParser.DeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.text_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterText_statement([NotNull] BetterAdvGmParser.Text_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.text_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitText_statement([NotNull] BetterAdvGmParser.Text_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.input_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInput_statement([NotNull] BetterAdvGmParser.Input_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.input_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInput_statement([NotNull] BetterAdvGmParser.Input_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.if_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIf_statement([NotNull] BetterAdvGmParser.If_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.if_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIf_statement([NotNull] BetterAdvGmParser.If_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.else_if_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElse_if_statement([NotNull] BetterAdvGmParser.Else_if_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.else_if_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElse_if_statement([NotNull] BetterAdvGmParser.Else_if_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.else_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElse_statement([NotNull] BetterAdvGmParser.Else_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.else_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElse_statement([NotNull] BetterAdvGmParser.Else_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.travel_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.travel_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.choice_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.choice_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.option_statment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.option_statment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.int_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInt_assign([NotNull] BetterAdvGmParser.Int_assignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.int_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInt_assign([NotNull] BetterAdvGmParser.Int_assignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.string_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterString_assign([NotNull] BetterAdvGmParser.String_assignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.string_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitString_assign([NotNull] BetterAdvGmParser.String_assignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.input_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInput_assign([NotNull] BetterAdvGmParser.Input_assignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.input_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInput_assign([NotNull] BetterAdvGmParser.Input_assignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.location_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocation_assign([NotNull] BetterAdvGmParser.Location_assignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.location_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocation_assign([NotNull] BetterAdvGmParser.Location_assignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.int_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInt_declaration([NotNull] BetterAdvGmParser.Int_declarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.int_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInt_declaration([NotNull] BetterAdvGmParser.Int_declarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.string_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterString_declaration([NotNull] BetterAdvGmParser.String_declarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.string_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitString_declaration([NotNull] BetterAdvGmParser.String_declarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.location_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocation_declaration([NotNull] BetterAdvGmParser.Location_declarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.location_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocation_declaration([NotNull] BetterAdvGmParser.Location_declarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="BetterAdvGmParser.predicate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPredicate([NotNull] BetterAdvGmParser.PredicateContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="BetterAdvGmParser.predicate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPredicate([NotNull] BetterAdvGmParser.PredicateContext context);
}
