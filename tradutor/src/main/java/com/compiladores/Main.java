//"https://profsergiocosta.notion.site/Tradu-o-dirigida-por-sintaxe-bc590c67d8234f81bee5cfdb505f2dd1"
package com.compiladores;

import com.compiladores.scanner.Scanner;
import com.compiladores.scanner.Token;
import com.compiladores.scanner.TokenType;

public class Main {
    public static void main(String[] args) {
        String input = "45  + preco - 876";
        Scanner scan = new Scanner(input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
    }
}
