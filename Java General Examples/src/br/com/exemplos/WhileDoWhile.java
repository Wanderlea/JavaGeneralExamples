//Wanderleá lodi
//06/03/2016

package br.com.exemplos;

public class WhileDoWhile {
	
	public static void main(String[] args) {
		
		int number = 0;
		
		//check and then run		
		while (number <=10){
			System.out.println("Number "+number);
			number++;
		}
		
		//run and then check
		int number2 = 11;
		do{
			System.out.println("Number2 "+number2);
			number2++;
			
		}while(number2 <=10);
	}

}
