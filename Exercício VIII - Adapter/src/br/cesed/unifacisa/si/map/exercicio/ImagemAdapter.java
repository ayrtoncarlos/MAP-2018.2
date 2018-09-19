package br.cesed.unifacisa.si.map.exercicio;

public class ImagemAdapter implements ImagemTarget, Imagem
{
	Imagem imagem;

    public short altura() 
    {
        return this.imagem.altura();
    }

    public short largura() 
    {
        return this.imagem.largura();
    }
    
    @Override
    public String toString() 
    {
        return "largura:" + largura() + " altura:" + altura();
    }

	@Override
	public void carregarImagem(String nomeDoArquivo) 
	{
		System.out.println("Imagem " + nomeDoArquivo + " carregada.");
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) 
	{
		System.out.println("Imagem desenhada.");
	}
}
