package metodosStaticExemplos;

import java.util.Scanner;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void test() {
		//System.out.println(Calculadora.potencia(2, 4)); 
		//System.out.println(Calculadora.fatorial(5));
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do{
			System.out.println("Entre com um n�mero positivo");
			num = scan.nextInt();
			
			if(num<0){
				System.out.println("N�mero inv�lido entre novamente");
			}
		}while (num < 0);
		
		System.out.println(Calculadora.fatorial(num));
		
	}

}
