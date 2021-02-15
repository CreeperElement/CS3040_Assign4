// Generated from cgrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cgrammarParser}.
 */
public interface cgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cgrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cgrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(cgrammarParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(cgrammarParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(cgrammarParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(cgrammarParser.MultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cgrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cgrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(cgrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(cgrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(cgrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(cgrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(cgrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(cgrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(cgrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(cgrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(cgrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(cgrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#restOfIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRestOfIdentifier(cgrammarParser.RestOfIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#restOfIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRestOfIdentifier(cgrammarParser.RestOfIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cgrammarParser#alphaNum}.
	 * @param ctx the parse tree
	 */
	void enterAlphaNum(cgrammarParser.AlphaNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link cgrammarParser#alphaNum}.
	 * @param ctx the parse tree
	 */
	void exitAlphaNum(cgrammarParser.AlphaNumContext ctx);
}