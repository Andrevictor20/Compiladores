package com.compiladores.scanner;



public class Token {

    public final TokenType type;
    public final String lexeme;

    public Token (TokenType type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    public String toString() {
        return "<"+ type +">" + lexeme + "</"+ type + ">";
    }
    
}
