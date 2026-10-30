package aula_2910;

public class PrincipalP {

	public static void main(String[] args) {
		
		PessoaH pessoah = new PessoaH ("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoah.getNome());
		System.out.println("Telefone: " + pessoah.getTelefone());

		PessoaFisica pessoafisica = new PessoaFisica ("João da Silva", "(11) 9999-9999", "111.111.111.11", "111.111.111-1" );
	    System.out.println("Pessoa: ");
	    System.out.println("Nome: " + pessoah.getNome());
		System.out.println("Telefone: " + pessoah.getTelefone());
		System.out.println("CPF: " + pessoafisica.getCpf());
		System.out.println("RG: " + pessoafisica.getRg());
		
		PessoaJuridica pessoajuridica = new PessoaJuridica ("Empresa XY2", "(11) 9999-9999", "12.345.678/9001-23");
		System.out.println("Pessoa: ");
	    System.out.println("Nome: " + pessoah.getNome());
		System.out.println("Telefone: " + pessoah.getTelefone());
		System.out.println("CNPJ: " + pessoajuridica.getCnpj());
	}

}
