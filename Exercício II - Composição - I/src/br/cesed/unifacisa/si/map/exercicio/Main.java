package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe Main para executar métodos criados na aplicação.
 */
public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Ayrton", "Campina Grande");

		System.out.println("Classe Pessoa:");
		System.out.println("	Nome: " + pessoa.getNome());
		System.out.println("	Endereço: " + pessoa.getEndereco());

		Tripulacao pessoa2 = new Tripulacao(pessoa, 10);

		pessoa2.setNome("Unifacisa");
		pessoa2.setEndereco("Campina Grande");
		pessoa2.setId_tripulacao(20);

		System.out.println("\nClasse Tripulacao:");
		System.out.println("	Nome: " + pessoa2.getNome());
		System.out.println("	Endereço: " + pessoa2.getEndereco());
		System.out.println("	ID Tripulação: " + pessoa2.getId_tripulacao());

		Passageiro pessoa3 = new Passageiro(pessoa, 20);

		pessoa3.setNome("Mateus");
		pessoa3.setEndereco("Campina Grande");
		pessoa3.setNumeroSimples(30);

		System.out.println("\nClasse Passageiro:");
		System.out.println("	Nome: " + pessoa3.getNome());
		System.out.println("	Endereço: " + pessoa3.getEndereco());
		System.out.println("	Numero Simples: " + pessoa3.getNumeroSimples());

		Agente pessoa4 = new Agente(pessoa, 30);

		pessoa4.setNome("Cassio");
		pessoa4.setEndereco("Esperança");
		pessoa4.setId_agente(40);

		System.out.println("\nClasse Agente:");
		System.out.println("	Nome: " + pessoa4.getNome());
		System.out.println("	Endereço: " + pessoa4.getEndereco());
		System.out.println("	ID Agente: " + pessoa4.getId_agente());

	}
}
