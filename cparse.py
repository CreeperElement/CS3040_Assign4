import antlr4
from antlr4.InputStream import InputStream
from antlr4.FileStream import FileStream
from antlr4.error.ErrorStrategy import BailErrorStrategy
from antlr4.error.Errors import ParseCancellationException
from cgrammarLexer import cgrammarLexer
from cgrammarParser import cgrammarParser
import sys

variables = []
ifCounter = 0
whileCounter = 0

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
    try:
        tree = parser.program()
    except ParseCancellationException as err:
        print("Syntax error in input, discovered by line " + str(lexer.line))

def addVariable(name):
    variables.append(name)

def addIf():
    global ifCounter
    ifCounter = ifCounter + 1

def addWhile():
    global whileCounter
    whileCounter = whileCounter + 1

def printVariables():
    output = "All declared variables: "
    for variable in variables:
        output += variable + ", "
    print(output[:-2])
    global ifCounter
    print("Number of if statements: " + str(ifCounter))
    global whileCounter
    print("Number of while statements: " + str(whileCounter))

if __name__ == '__main__':
    variables = []
    main()
