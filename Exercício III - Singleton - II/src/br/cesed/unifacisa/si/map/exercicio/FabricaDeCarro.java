package br.cesed.unifacisa.si.map.exercicio;
/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa uma fábrica de carros.
 */
public class FabricaDeCarro 
{
	private static FabricaDeCarro instancia;
	private int totalCarrosFiat;
	private int totalCarrosFord;
	private int totalCarrosVolks;
	
	/**
	 * Método construtor.
	 */
	protected FabricaDeCarro() 
	{
		
	}
	
	/**
	 * Método que verifica se a classe já possui uma instância criada.
	 * @return instancia - Uma instância da classe.
	 */
	public static FabricaDeCarro getInstancia() 
	{
		if(instancia == null) 
		{
			instancia = new FabricaDeCarro();
		}
		return instancia;
	}
	
	 /**
	  * Método que cria um carro da Volks.
	  * @return uma nova String com a marca e o número do carro criado.
	  */
	 public String criarCarroVolks() 
	 {
		 return new String("Carro Volks #" + ++totalCarrosVolks + " criado.");
	 }
	 
	 /**
	  * Método que cria um carro da Ford.
	  * @return uma nova String com a marca e o número do carro criado.
	  */
	 public String criarCarroFord() 
	 {
		 return new String("Carro Ford #" + ++totalCarrosFord + " criado.");
	 }
	 
	 /**
	  * Método que cria um carro da Fiat.
	  * @return uma nova String com a marca e o número do carro criado.
	  */
	 public String criarCarroFiat() 
	 {
		 return new String("Carro Fiat #" + ++totalCarrosFiat + " criado.");
	 }
	 
	 /**
	  * Método que gera um relatório de todos os carros vendidos da fábrica.
	  * @return uma nova String com a quantidade de carros vendidos de cada uma das marcas.
	  */
	 public String gerarRelatorio()
	 {
		 return new String("Total de carros da Fiat vendidos: " + totalCarrosFiat 
				 	+ "\nTotal de carros da Ford vendidos: " + totalCarrosFord
				 	+ "\nTotal de carros da Volks vendidos: " + totalCarrosVolks);
	 }
}
