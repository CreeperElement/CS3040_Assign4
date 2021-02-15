# Generated from cgrammar.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .cgrammarParser import cgrammarParser
else:
    from cgrammarParser import cgrammarParser

# This class defines a complete listener for a parse tree produced by cgrammarParser.
class cgrammarListener(ParseTreeListener):

    # Enter a parse tree produced by cgrammarParser#program.
    def enterProgram(self, ctx:cgrammarParser.ProgramContext):
        pass

    # Exit a parse tree produced by cgrammarParser#program.
    def exitProgram(self, ctx:cgrammarParser.ProgramContext):
        pass


    # Enter a parse tree produced by cgrammarParser#block.
    def enterBlock(self, ctx:cgrammarParser.BlockContext):
        pass

    # Exit a parse tree produced by cgrammarParser#block.
    def exitBlock(self, ctx:cgrammarParser.BlockContext):
        pass


    # Enter a parse tree produced by cgrammarParser#varDecl.
    def enterVarDecl(self, ctx:cgrammarParser.VarDeclContext):
        pass

    # Exit a parse tree produced by cgrammarParser#varDecl.
    def exitVarDecl(self, ctx:cgrammarParser.VarDeclContext):
        pass


    # Enter a parse tree produced by cgrammarParser#multiStatement.
    def enterMultiStatement(self, ctx:cgrammarParser.MultiStatementContext):
        pass

    # Exit a parse tree produced by cgrammarParser#multiStatement.
    def exitMultiStatement(self, ctx:cgrammarParser.MultiStatementContext):
        pass


    # Enter a parse tree produced by cgrammarParser#statement.
    def enterStatement(self, ctx:cgrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by cgrammarParser#statement.
    def exitStatement(self, ctx:cgrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by cgrammarParser#expr.
    def enterExpr(self, ctx:cgrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by cgrammarParser#expr.
    def exitExpr(self, ctx:cgrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by cgrammarParser#term.
    def enterTerm(self, ctx:cgrammarParser.TermContext):
        pass

    # Exit a parse tree produced by cgrammarParser#term.
    def exitTerm(self, ctx:cgrammarParser.TermContext):
        pass


    # Enter a parse tree produced by cgrammarParser#factor.
    def enterFactor(self, ctx:cgrammarParser.FactorContext):
        pass

    # Exit a parse tree produced by cgrammarParser#factor.
    def exitFactor(self, ctx:cgrammarParser.FactorContext):
        pass


    # Enter a parse tree produced by cgrammarParser#literal.
    def enterLiteral(self, ctx:cgrammarParser.LiteralContext):
        pass

    # Exit a parse tree produced by cgrammarParser#literal.
    def exitLiteral(self, ctx:cgrammarParser.LiteralContext):
        pass


    # Enter a parse tree produced by cgrammarParser#identifier.
    def enterIdentifier(self, ctx:cgrammarParser.IdentifierContext):
        pass

    # Exit a parse tree produced by cgrammarParser#identifier.
    def exitIdentifier(self, ctx:cgrammarParser.IdentifierContext):
        pass


    # Enter a parse tree produced by cgrammarParser#restOfIdentifier.
    def enterRestOfIdentifier(self, ctx:cgrammarParser.RestOfIdentifierContext):
        pass

    # Exit a parse tree produced by cgrammarParser#restOfIdentifier.
    def exitRestOfIdentifier(self, ctx:cgrammarParser.RestOfIdentifierContext):
        pass


    # Enter a parse tree produced by cgrammarParser#alphaNum.
    def enterAlphaNum(self, ctx:cgrammarParser.AlphaNumContext):
        pass

    # Exit a parse tree produced by cgrammarParser#alphaNum.
    def exitAlphaNum(self, ctx:cgrammarParser.AlphaNumContext):
        pass



del cgrammarParser