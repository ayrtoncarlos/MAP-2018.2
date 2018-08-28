package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa uma Tripulação.
 */
public class Tripulacao {

	private int id_tripulacao;
	private Pessoa pessoa;

	public Tripulacao(Pessoa pessoa, int id_tripulacao) {
		this.pessoa = pessoa;
		this.id_tripulacao = id_tripulacao;
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

	public int getId_tripulacao() {
		return id_tripulacao;
	}

	public void setId_tripulacao(int id_tripulacao) {
		this.id_tripulacao = id_tripulacao;
	}

}
