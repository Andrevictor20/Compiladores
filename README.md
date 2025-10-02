    
# Compiladores - Tradutor

Este projeto consiste em um tradutor/interpreter simples desenvolvido em Java, como parte do trabalho da disciplina de Compiladores. O objetivo é analisar, interpretar e executar comandos de uma linguagem definida pelo usuário, utilizando técnicas de análise léxica, sintática e semântica.

## Estrutura do Projeto

- **src/main/java/com/compiladores/**
	- `Main.java`: Ponto de entrada do programa.
	- **interpretador/**
		- `Interpretador.java`: Responsável pela execução dos comandos interpretados.
	- **parser/**
		- `Parser.java`: Realiza a análise sintática dos tokens gerados pelo scanner.
	- **scanner/**
		- `Scanner.java`: Realiza a análise léxica, transformando o código fonte em tokens.
		- `Token.java`: Estrutura de dados para representar um token.
		- `TokenType.java`: Enumeração dos tipos de tokens reconhecidos.

- **src/test/java/com/compiladores/**
	- `AppTest.java`: Testes automatizados para garantir o funcionamento do tradutor.

- **pom.xml**: Gerenciamento de dependências e configuração do projeto Maven.

## Funcionalidades

- Análise léxica: Identificação de tokens da linguagem.
- Análise sintática: Verificação da estrutura dos comandos.
- Interpretação: Execução dos comandos reconhecidos.
- Testes automatizados para validação das funcionalidades.



## Autores

- André Victor Macedo Pereira
