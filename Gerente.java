package desafio4;

public class Gerente extends Funcionario {
	private double bonus;
	
	

	public Gerente(String nome, double salarioBase, double bonus) {
		super(nome, salarioBase);
		this.bonus = bonus;
		
	}

	@Override
	public double calcularSalario() {
		return  getSalarioBase() + bonus;
	}

	@Override
	public void ExibirDetalhes() {
		super.ExibirDetalhes();
		System.out.println("Bonus: " + bonus);
		System.out.println("Salario Total: " + calcularSalario());
	}
	
}
