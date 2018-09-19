package br.cesed.unifacisa.si.map.exercicio;

public class ImagemBMP implements Imagem
{
	@Override
    public short altura() 
	{
        return 256;
    }

    @Override
    public short largura() 
    {
        return 256;
    }
}
