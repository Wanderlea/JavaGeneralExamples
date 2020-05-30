package metodosStaticExemplos;

public class ContadorTeste {
	
	static void imprimirValor(){
		System.out.println(Contador.oberValor());
	}
	
	public static void main(String[] args) {
		
		Contador cont = new Contador();
		
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		for(int i=0;i<5;i++){
			Contador.incrementar();
		}
		
		imprimirValor();
	}

}
