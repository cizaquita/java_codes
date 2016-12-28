
public class Alcancia 
{

	private int Moneda100, Moneda200, Moneda500, Total;
	
	public Alcancia()
	{
		Moneda100=0;
		Moneda200=0;
		Moneda500=0;
		Total=0;
	}
	
	public void AgregarMoneda100()//Suma una moneda de 100 a la alcancia
	{
		Moneda100++;
	}
	
	public void AgregarMoneda200()//Suma una moneda de 200 a la alcancia
	{
		Moneda200++;
	}
	
	public void AgregarMoneda500()//Suma una moneda de 500 a la Alcancia
	{
		Moneda500++;
	}
	
	public int GetNumeroMonedas100()
	{
		return Moneda100;
	}
	
	public int GetNumeroMonedas200()
	{
		return Moneda200;
	}
	
	public int GetNumeroMonedas500()
	{
		return Moneda500;
	}
	
	public int getTotalDinero()
	{
		int Total=0;
		Total=(Moneda100*100)+(Moneda200*200)+(Moneda500*500);
		return Total;
	}
	
	public String getListadoAlcancia()
	{
		String Listado;
		Listado="\nMonedas de 100 = "+GetNumeroMonedas100()+
				"\nMonedas de 200 = "+GetNumeroMonedas200()+
				"\nMonedas de 500 = "+GetNumeroMonedas500();
		return Listado;
	}
	
	public String getRomperAlcancia()
	{
		String RomperAlcancia;
		RomperAlcancia="\nMonedas de 100 = "+GetNumeroMonedas100()+
						"\nMonedas de 200 = "+GetNumeroMonedas200()+
						"\nMonedas de 500 = "+GetNumeroMonedas500()+
						"\n\nTotal dinero ahorrado = "+getTotalDinero();
		return RomperAlcancia;
	}
	
	public void IniciarAlcancia()
	{
		Moneda100=0;
		Moneda200=0;
		Moneda500=0;
		Total=0;
	}
}
