//"https://profsergiocosta.notion.site/Tradu-o-dirigida-por-sintaxe-bc590c67d8234f81bee5cfdb505f2dd1"
package com.compiladores;

import com.compiladores.parser.Parser;

public class Main {
    public static void main(String[] args) {
        String input = "45  + preco - 876";
        Parser p = new Parser(input.getBytes());
        p.parse();
    }
}
