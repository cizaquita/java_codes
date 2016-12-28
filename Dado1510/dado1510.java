

public class dado1510 
{
	private double Max1510=6;
	private int ValorCara1510;
	private int Valor2Cara1510;
	
	public dado1510()
	{
		ValorCara1510=1;
		Valor2Cara1510=1;
	}
	
	public int ValorDado1510()
	{		
		int ValorCara1510;
		ValorCara1510=(int)(Math.random()*Max1510)+1;
		return ValorCara1510;
	}
	
	public int Valor2Dado1510()
	{		
		int Valor2Cara1510;
		Valor2Cara1510=(int)(Math.random()*Max1510)+1;
		return Valor2Cara1510;
	}

	public int getValorCara()
	{
		return ValorCara1510;
	}
	
	public int getValor2Cara()
	{
		return Valor2Cara1510;
	}

	public void setValorCara151089(int Valor)
	{		
		ValorCara1510=Valor;
	}	
	
	public void setValor2Cara151089(int valor)
	{		
		Valor2Cara1510=valor;
	}	
	
}
