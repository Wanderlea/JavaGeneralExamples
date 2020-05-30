package impostoDeRendaClassesAbstratas;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setName("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("123.456.33");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setName("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCpf("123.569.963");
		p2.calcularImposto();
		
		PessoaJuridica p3 = new PessoaJuridica();
		p3.setName("Contribuinte 02");
		p3.setRendaBruta(5000);
		p3.setCnpj("23.96.366333");
		p3.calcularImposto();
		
		Contribuinte[] contribuintes = new Contribuinte[3];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte);
		}
		
	}

}
