package desafio4;

public  abstract class Funcionario {
	private String nome;
	private double salarioBase;
	
	public abstract double calcularSalario();
	
	
	public void ExibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salarioBase);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	
	
}
