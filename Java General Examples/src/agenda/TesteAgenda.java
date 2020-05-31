package agenda;

import java.util.Iterator;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Maria");
		
		Endereco end = new Endereco();
		end.setNomeRua("rua 123");
		end.setNumero("n/a");
		end.setCep("8989898");
		end.setCidade("cidade");
		end.setEstado("estado");
		
		contato.setEndereco(end);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("49");
		telefone.setNumero("99958585");
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("casa");
		telefone1.setDdd("49");
		telefone1.setNumero("99958586");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone1;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if(contato != null && contato.getTelefones() != null){
			for (Telefone tel : contato.getTelefones()) {
				System.out.println(tel.getNumero());
			}
		}
	}

}
