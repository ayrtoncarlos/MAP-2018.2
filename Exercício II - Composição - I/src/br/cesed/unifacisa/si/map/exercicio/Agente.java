package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa um Agente.
 */
public class Agente {

	private int id_agente;
	private Pessoa pessoa;

	public Agente(Pessoa pessoa, int id_agente) {
		this.pessoa = pessoa;
		this.id_agente = id_agente;
	}

	public String getNome() {
		return this.pessoa.getNome();
	}

	public void setNome(String nome) {
		this.pessoa.setNome(nome);
	}

	public void setEndereco(String endereco) {
		this.pessoa.setEndereco(endereco);
	}

	public String getEndereco() {
		return this.pessoa.getEndereco();
	}

	public int getId_agente() {
		return id_agente;
	}

	public void setId_agente(int id_agente) {
		this.id_agente = id_agente;
	}

}
