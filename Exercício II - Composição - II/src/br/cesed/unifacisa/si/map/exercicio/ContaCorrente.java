package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 * 
 *	Classe que representa uma Conta Corrente.
 */
public class ContaCorrente {

	private ContaBancaria conta;

	public ContaCorrente(ContaBancaria conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return conta.getSaldo();
	}

	public void depositar(double saldo) {
		conta.depositar(saldo);
	}

	public void setNome(String nome) {
		conta.setNome(nome);
	}

	public String getNome() {
		return conta.getNome();
	}

	public void setCpf(String cpf) {
		conta.setCpf(cpf);
	}

	public String getCpf() {
		return conta.getCpf();
	}
}
