package com.compiladores.parser;

import com.compiladores.scanner.Scanner;

public class Parser {

    private Scanner scan;
    private char currentToken;

    public Parser(byte[] input) {
        scan = new Scanner(input);
        currentToken = scan.nextToken();
    }

    private void nextToken() {
        currentToken = scan.nextToken();
    }

    public void parse() {
        expr();
    }

    private void match(char c) {
        if (c == peek()) {
            current++;
        } else {
            throw new Error("syntax error");
        }
    }

    void expr() {
        digit();
        oper();
    }

    void digit() {
        if (Character.isDigit(peek())) {
            System.out.println("push " + peek());
            match(peek());
        } else {
            throw new Error("syntax error");
        }
    }

    void oper() {
        if (peek() == '+') {
            match('+');
            digit();
            System.out.println("add");
            oper();
        } else if (peek() == '-') {
            match('-');
            digit();
            System.out.println("sub");
            oper();
        }
    }

}
