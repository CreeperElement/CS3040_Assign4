import antlr4
from antlr4.InputStream import InputStream
from antlr4.FileStream import FileStream
from antlr4.error.ErrorStrategy import BailErrorStrategy
from antlr4.error.Errors import ParseCancellationException
from cgrammarLexer import cgrammarLexer
from cgrammarParser import cgrammarParser
import sys

variables = []

def main():
    input_stream = None
    if len(sys.argv) > 1:
        input_stream = FileStream(sys.argv[1])
    else:
        print("Please pipe in your c file.")
        fileIn = "".join(sys.stdin.readlines())
        input_stream = InputStream(fileIn)
    lexer = cgrammarLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = cgrammarParser(stream)
    parser._errHandler = BailErrorStrategy()
    print("All vars" + str(variables))
    try:
        tree = parser.program()
        printVariables()
    except ParseCancellationException as err:
        print("Syntax error in input, discovered by line " + str(lexer.line))

def addVariable(name):
    variables.append(name)
    print(variables)

def printVariables():
    print("All declared variables:")
    for variable in variables:
        print('\t' + variable)

if __name__ == '__main__':
    variables = []
    main()
