//Wanderléa lodi
//05/03/2016

package br.com.exemplos;

public class TernaryOperator {
	
	public static void main(String[] args) {
		int media = 0;
		int nota1 = 10;
		int nota2 = 2;
		
		media = (nota1 + nota2)/2;
		
		//Simple Ternary Operator (? if : else) 
		String saidaResultado = media >=7 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		//Simple Ternary Operator(if, else if, else)
		String saidaResultado1 = media >=7 ? "Aluno Aprovado" : (media >= 4 && media <=6) ? "Aluno em Recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado1);
	}

}
