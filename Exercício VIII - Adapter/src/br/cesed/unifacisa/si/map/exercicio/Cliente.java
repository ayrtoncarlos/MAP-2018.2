package br.cesed.unifacisa.si.map.exercicio;

public class Cliente 
{
	public static void main(String[] args) 
	{
		System.out.println("Criando imagem PNG:\n");
		ImagemTarget imagem = new ImagemAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		System.out.println("\nCriando imagem JPG:\n");
		imagem = new ImagemAdapter();
		imagem.carregarImagem("teste.jpg");
		imagem.desenharImagem(0, 0, 10, 10);
		
		System.out.println("\nCriando imagem BMP:\n");
		imagem = new ImagemAdapter();
		imagem.carregarImagem("teste.bmp");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
