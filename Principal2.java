package aula_2910;

public class Principal2 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Daniel Silva", "111.111.111-11", 1.500, "Serviços Gerais", "Limpeza");
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		Atendente atendente = new Atendente("Luciana Oliveira", "222.222.222-22", 1.750, "Atendente", "Atendimento ao Cliente", 10.00);
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Ajuda de Custo" + atendente.getAjudadeCusto());
		
		Gerente gerente = new Gerente("Plano de Saúde", 2.500);
		System.out.println("Beneficios: " + gerente.getBeneficios());
		System.out.println("Premiacao: " + gerente.getPremiacao());
		

	}

}
