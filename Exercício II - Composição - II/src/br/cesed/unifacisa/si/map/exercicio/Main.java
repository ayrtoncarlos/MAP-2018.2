package br.cesed.unifacisa.si.map.exercicio;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe Main para executar métodos da aplicação.
 */
public class Main {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria("66666666666");
		
		conta.setNome("Ayrton");
		conta.depositar(100);
		
		System.out.println("Classe ContaBancaria:");
		System.out.println("	Nome: " + conta.getNome());
		System.out.println("	CPF:" + conta.getCpf());
		System.out.println("	Saldo: " + conta.getSaldo());
		
		ContaCorrente conta2 = new ContaCorrente(conta);
		
		conta2.setNome("Vanessa");
		conta2.setCpf("12345678910");
		conta2.depositar(200);
		
		System.out.println("\nClasse ContaCorrente:");
		System.out.println("	Nome: " + conta2.getNome());
		System.out.println("	CPF:" + conta2.getCpf());
		System.out.println("	Saldo: " + conta2.getSaldo());
		
		ContaPoupanca conta3 = new ContaPoupanca(conta);
		
		conta3.setNome("Mateus");
		conta3.setCpf("11122233344");
		conta3.depositar(300);
		
		System.out.println("\nClasse ContaPoupanca:");
		System.out.println("	Nome: " + conta3.getNome());
		System.out.println("	CPF:" + conta3.getCpf());
		System.out.println("	Saldo: " + conta3.getSaldo());
	}

}
