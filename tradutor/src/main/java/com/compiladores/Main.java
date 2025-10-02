//"https://profsergiocosta.notion.site/Tradu-o-dirigida-por-sintaxe-bc590c67d8234f81bee5cfdb505f2dd1"
package com.compiladores;

import com.compiladores.parser.Parser;

public class Main {
  public static void main(String[] args) throws Exception {

    String input = """
        let a = 42 + 5 - 8;
        let b = 56 + 8;
        print a + b + 6;
            """;

    Parser p = new Parser(input.getBytes());
    p.parse();
  }

}