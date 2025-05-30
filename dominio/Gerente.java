package dominio;

public class gerente extends funcionario{
	public gerente(String nome, double salarioBase) {
		super(nome,salarioBase);
	}
	
	@Override
	public double CalcularSalarioBase() {
		return (salarioBase + (salarioBase * 20/100));
	}
}