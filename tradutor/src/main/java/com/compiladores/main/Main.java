//"https://profsergiocosta.notion.site/1-Um-simples-tradutor-fbb0d4d00474436db8bfa5ec543ccadf"
package com.compiladores.main;

import com.compiladores.parser.Parser;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "8+5-7+9";
        Parser p = new Parser(input.getBytes());
        p.parse();

    }
}
