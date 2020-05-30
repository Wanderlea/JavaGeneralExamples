package impostoDeRendaClassesAbstratas;

public abstract class Contribuinte {
	
	private String name;
	private double rendaBruta;
	
	public abstract double calcularImposto();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	@Override
	public String toString() {
		return "Contribuinte [name=" + name + ", rendaBruta=" + rendaBruta + "]";
	}

}
