package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa o main da classe FabricaDeCarro.
 */
public class Main {

	/**
	 * Método com exemplo da criação de uma instância da classe FabricaDeCarro,
	 * criação de carros, e de gerar um relatório de vendas da fábrica.
	 * @param args - Todos os argumentos passados no método.
	 */
	public static void main(String[] args) 
	{
		// Criando a primeira instancia da classe FabricaDeCarro.
		FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
		
		System.out.println("Fabrica de Carros:\n");
		System.out.println(fabrica.criarCarroFiat());
		System.out.println(fabrica.criarCarroFord());
		System.out.println(fabrica.criarCarroVolks());
		
		System.out.println("\nRelatório de vendas:\n");
		System.out.println(fabrica.gerarRelatorio());
		
		
		// Perceba que mesmo tentando criar uma nova instância da classe FabricaDeCarro,
		// não será perdido nenhuma informação, pois já existe uma instância criada para esta classe.
		fabrica = FabricaDeCarro.getInstancia();
		
		System.out.println("\nNovo Relatório de vendas:\n");
		System.out.println(fabrica.gerarRelatorio());

	}

}
