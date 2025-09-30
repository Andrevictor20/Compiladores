//"https://profsergiocosta.notion.site/Tradu-o-dirigida-por-sintaxe-bc590c67d8234f81bee5cfdb505f2dd1"
package com.compiladores.main;

import com.compiladores.parser.Parser;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "8+5-7+9";
        Parser p = new Parser(input.getBytes());
        p.parse();

    }
}
