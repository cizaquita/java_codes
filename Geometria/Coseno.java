
public class Coseno {
	private double Angulo660;
	private int Limite660;
	
	public Coseno()
	{
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
	public double CalcularFactorial0660(double numero)
	{
		double  cont,fact = 1;
		for (cont=1;cont<=numero;cont++)
			fact=fact*cont;
			return fact;	
	}
	
	public double ConvertirRadianes(double Valorx660){
		double radianes=Valorx660*Math.PI/180;
		return radianes;
	}
	
	public double CalcularCoseno()
	{
		double i, fact, pot1, pot2, suma, AngR;
		suma=0;
		AngR=ConvertirRadianes(Angulo660);
		for(i=1;i<=Limite660;i++){
			pot1=Math.pow(-1, i+1);
			pot2=Math.pow(AngR, 2*i-2);
			fact=CalcularFactorial0660(2*i-2);
			suma=suma+(pot1*(pot2/fact));
			
		}
		return suma;
			
	}
	
	public String SalidaDatosSin()
	{
		String Datos;
		Datos="Limite="+getLimite()+"\nangulo="+getAngulo660()+"\nEl coseno de '"+getAngulo660()+"' es = "+CalcularCoseno();
		return Datos;
	}
}
