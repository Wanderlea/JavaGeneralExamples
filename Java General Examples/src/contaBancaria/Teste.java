package contaBancaria;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("123-1");
		contaSimples.setSaldo(1000);

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 1200);

		System.out.println(contaSimples);

		System.out.println("*** Teste ContaPoupanca ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta poupanca");
		contaPoupanca.setNumConta("123-2");
		contaPoupanca.setSaldo(1000);
		contaPoupanca.setDiaRendimento(10);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 1200);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento novo saldo não calculado.");
		}

		System.out.println(contaPoupanca);

		System.out.println("*** Teste ContaEsepecial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta Especial");
		contaEspecial.setNumConta("123-3");
		contaEspecial.setSaldo(1000);
		contaEspecial.setLimite(100);
		
		//Polimorfirmo
		realizarSaque(contaEspecial, 1110);
		System.out.println(contaEspecial);
	}

	public static void realizarSaque(ContaBancaria conta, double valor) {

		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente! " + "Saldo atual: " + conta.getSaldo());
		}
	}

}
