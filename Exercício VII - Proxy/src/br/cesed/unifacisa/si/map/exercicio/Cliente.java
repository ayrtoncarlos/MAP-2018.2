package br.cesed.unifacisa.si.map.exercicio;

public class Cliente 
{
	public static void main(String[] args)
	{
		BancoProxy banco = new BancoProxy("Ayrton", "666");
		
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
