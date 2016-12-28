public class EulerPositivo 
{

	private int Limite706;
	private double Valorx706;
	
	public EulerPositivo()
	{
		Limite706=0;
		Valorx706=0;
	}
	
	public double getValorx706()
	{
		return Valorx706;
	}
	
	public int getLimite706()
	{
		return Limite706;
	}
	
	public void setValorx706(double nvalorx)
	{
		Valorx706=nvalorx;
	}	
	
	public void setLimite706(int  nlimite)
	{
		Limite706=nlimite;
	}
	
	public double CalcularFactorial706(double Numero)
	{
		double Contador, fact=1;
		
		for(Contador=1;Contador<=Numero;Contador++)
		{
			fact=fact*Contador;
		}
		
		return fact;
	}
	
	public double calcularEulerPos706()
	{
		double Potencia, Fac, Suma=0, Contador;
		
		Contador=0;
		
		while(Contador<=Limite706)
		{
			
			Potencia=Math.pow(Valorx706, Contador);
			Fac=CalcularFactorial706(Contador);
			Suma=Suma+(Potencia/Fac);
			Contador++;
		}
		return Suma;				
	}
	
	public String SalidaDatos706()
	{
		String Datos;
		Datos="Valor x = "+getValorx706()+"\n\nL�mite de la Sumatoria = "+getLimite706()+"\n\n e^"+getValorx706()+" = "+calcularEulerPos706();
		
		return Datos;		
	}
}
