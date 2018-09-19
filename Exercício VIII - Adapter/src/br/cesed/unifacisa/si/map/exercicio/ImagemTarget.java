package br.cesed.unifacisa.si.map.exercicio;

public interface ImagemTarget 
{
	void carregarImagem(String nomeDoArquivo);
    void desenharImagem(int posX, int posY, int largura, int altura);
}
