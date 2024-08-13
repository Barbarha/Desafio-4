package desafio4;

import java.util.ArrayList;
import java.util.Scanner;

 
public class GestaoFuncionario {
	private ArrayList<Funcionario> funcionarios;
	private Scanner scanner;
	
	public GestaoFuncionario() {
		funcionarios = new ArrayList<>();
		scanner = new Scanner(System.in);
		
	}
	
	void iniciar() {
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1- Adicionar Gerente");
			System.out.println("2- Adicionar Desenvolvedor");
			System.out.println("3- Visualizar detalhes dos funcionários");
			System.out.println("4- Calcular salario");
			System.out.println("5- Sair");
			System.out.println("Escolha uma opção");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
				case 1: 
					adicionarGerente();
					break;
				case 2: 
					adicionarDesenvolvedor();
					break;
				case 3: 
					vizualizarDetalhesFuncioarios();
					break;
				case 4: 
					calcularSalario();
					break;
				case 5: 
					System.out.println("Obrigada por usar o super sistema de gestão");
					break;
				default:
					System.out.println("Opção invalida! Tente novamente");
					
			}
			
			
		}while (opcao != 5);
		
	}
	
	private void adicionarGerente() {
		System.out.println("Digite o nome de um gerente: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o salario base do gerente: ");
		double salarioBase = scanner.nextDouble();
		System.out.println("Digite o bonus dp gerente: ");
		double bonus = scanner.nextDouble();
		scanner.nextLine();
		
		Gerente gerente = new Gerente(nome, salarioBase, bonus);
		funcionarios.add(gerente);
		System.out.println("gerente adicionado com sucesso!");
		
	}
	private void adicionarDesenvolvedor() {
		System.out.println("Digite o nome de um desenvolvedor: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o salario base do desenvolvedor: ");
		double salarioBase = scanner.nextDouble();
		System.out.println("Digite as horas extras do dsenvolvedor: ");
		int horasExtras = scanner.nextInt();
		System.out.println("Digite o valor da hpra extra: ");
		double valorHoraExtra = scanner.nextDouble();
		scanner.nextLine();
		
		Desenvolvedor desenvolvedor = new Desenvolvedor(nome, salarioBase, horasExtras, valorHoraExtra);
		funcionarios.add(desenvolvedor);
		System.out.println("Desenvolvedor adicionado com sucesso!");
	}
	private void vizualizarDetalhesFuncioarios() {
		if(funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado!");
			return;
		}
		for(Funcionario funcionario : funcionarios) {
			funcionario.ExibirDetalhes();
			System.out.println("------------");
		}
	}
	
	private void calcularSalario() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado");
			return;	
		}
		
		for(Funcionario funcionario : funcionarios) {
			System.out.println("O salario do funcinario" + funcionario.getNome() +
					": " + funcionario.calcularSalario());
			
		}
	}
}
