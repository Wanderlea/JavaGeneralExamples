package impostoDeRendaClassesAbstratas;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
		//return (this.getRendaBruta()/100)*10;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", calcularImposto()=" + calcularImposto() + ", toString()="
				+ super.toString() + "]";
	}
}
