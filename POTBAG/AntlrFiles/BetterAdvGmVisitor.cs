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
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="BetterAdvGmParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.1")]
[System.CLSCompliant(false)]
public interface IBetterAdvGmVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProg([NotNull] BetterAdvGmParser.ProgContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.setup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSetup([NotNull] BetterAdvGmParser.SetupContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.locationsetup"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLocationsetup([NotNull] BetterAdvGmParser.LocationsetupContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.locationmapping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLocationmapping([NotNull] BetterAdvGmParser.LocationmappingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.inBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInBlock([NotNull] BetterAdvGmParser.InBlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] BetterAdvGmParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] BetterAdvGmParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssign([NotNull] BetterAdvGmParser.AssignContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] BetterAdvGmParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.text_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitText_statement([NotNull] BetterAdvGmParser.Text_statementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.input_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInput_statement([NotNull] BetterAdvGmParser.Input_statementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.if_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIf_statement([NotNull] BetterAdvGmParser.If_statementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.travel_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.choice_statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.option_statment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.int_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInt_assign([NotNull] BetterAdvGmParser.Int_assignContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.string_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitString_assign([NotNull] BetterAdvGmParser.String_assignContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.input_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInput_assign([NotNull] BetterAdvGmParser.Input_assignContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.location_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLocation_assign([NotNull] BetterAdvGmParser.Location_assignContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.int_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInt_declaration([NotNull] BetterAdvGmParser.Int_declarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.string_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitString_declaration([NotNull] BetterAdvGmParser.String_declarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.location_declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLocation_declaration([NotNull] BetterAdvGmParser.Location_declarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BetterAdvGmParser.predicate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPredicate([NotNull] BetterAdvGmParser.PredicateContext context);
}
