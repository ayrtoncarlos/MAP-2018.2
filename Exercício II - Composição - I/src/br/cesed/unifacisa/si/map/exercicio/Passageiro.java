package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa um Passageiro.
 */
public class Passageiro {

	private int numeroSimples;
	private Pessoa pessoa;

	public Passageiro(Pessoa pessoa, int numeroSimples) {
		this.pessoa = pessoa;
		this.numeroSimples = numeroSimples;
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

	public int getNumeroSimples() {
		return numeroSimples;
	}

	public void setNumeroSimples(int numeroSimples) {
		this.numeroSimples = numeroSimples;
	}

}
