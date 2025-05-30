package dominio;

public class Estagiario extends funcionario{
	public void estagiario(String nome, double salarioBase) {
		super(nome,salarioBase);
	}
	
	@Override
	public double CalcularSalarioBase() {
		return (salarioBase + (salarioBase * 5/100));
	}
}
