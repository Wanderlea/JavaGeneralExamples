package metodosStaticExemplos;

public class Calculadora {

	public static int somar(int valor1, int valor2) {

		return valor1 + valor2;
	}

	public static int subtrair(int valor1, int valor2) {

		return valor1 - valor2;
	}

	public static int multiplicar(int valor1, int valor2) {

		return valor1 * valor2;
	}

	public static int dividir(int valor1, int valor2) {

		return valor1 / valor2;
	}

	public static int potencia(int valor1, int valor2) {

		int total = valor1;

		for (int i = 1; i < valor2; i++) {
			total *= valor1;
		}

		return total;
	}

	// x^n
	/*
	 * public static double potencia(int valor1, int valor2) {
	 * 
	 * return Math.pow(Double.valueOf(valor1) , Double.valueOf(valor2)); }
	 */

	// 5! = 5*4*3*2*1
	// 0! = 1
	public static int fatorial(int valor) {

		if (valor == 0) {
			return 1;
		}

		int total = 1;
		for (int i = valor; i > 1; i--) {
			total *= i;
		}

		return total;

	}

	public static int fatorialRecursivo(int valor) {

		if (valor == 0) {
			return 1;
		}

		return valor * fatorialRecursivo(valor-1);

	}
	
	public static int somaRecursiva(int valor){
		
		if (valor == 1){
			return 1;
		}
		return valor + somaRecursiva(valor-1);
	}

}
