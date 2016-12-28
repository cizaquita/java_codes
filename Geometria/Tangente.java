
public class Tangente {
	private double Angulo660;
	private int Limite660;
	
	Seno tangente=new Seno();
	Coseno tangente1=new Coseno();
	
	public Tangente(){
		Angulo660=0;
		Limite660=0;
	}
	
	public double getAngulo660()
	{
		return Angulo660;
	}
	
	public double getLimite()
	{
		return Limite660;
	}
	
	public void setLimite(int nLimite)
	{
		Limite660=nLimite;
	}
	
	public void setAngulo660(double nAngulo660)
	{
		Angulo660=nAngulo660;
	}	
	
	public double CalcularTangente(){
		double Division=0;
		Division=tangente.CalcularSeno()/tangente1.CalcularCoseno();
		return Division;
	}
	public String SalidaDatosSin()
	{
		String Datos;
		Datos="Limite="+getLimite()+"\nangulo="+getAngulo660()+"\nLa tangente de '"+getAngulo660()+"' es = "+CalcularTangente();
		return Datos;
	}
}
