package metodosStaticExemplos;

public class Contador {
	
	public Contador() {
		cont++;
	}
	
	private static int cont;
	
	public static void incrementar(){
		cont++;
	}
	
	public static void zerar(){
		cont=0;
	}
	
	public static int oberValor(){
		return cont;
	}

}
