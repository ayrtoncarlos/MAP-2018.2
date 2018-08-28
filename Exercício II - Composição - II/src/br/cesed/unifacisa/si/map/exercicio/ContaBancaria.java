package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 * 
 *	Classe que representa uma Conta Bancaria.
 */
public class ContaBancaria {

	private int numConta = 0;
	private int id_conta;
	private String nome;
	private String cpf;
	private double saldo;

	public ContaBancaria(String cpf) {
		this.id_conta = numConta++;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getId_conta() {
		return id_conta;
	}

	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {

		if (saldo >= valor) {
			saldo -= valor;

		} else {
			System.out.println("Saldo insuficiente. Faça um depósito\n");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}
}
