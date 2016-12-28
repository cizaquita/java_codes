//Cuenta de ahorros


public class Cuenta_Ahorros 
{

	private double saldo;
	private double intereses;
	
	public Cuenta_Ahorros() 
	{
		saldo=0;
		intereses=0.6;
	}
	
	public double GetSaldo1510()
	{
		return saldo;
	}
	
	public double GetIntereses1510()
	{
		intereses=saldo*0.006;
		return intereses;
	}
	
	public void consignarValor1510(int valor)
	{
		saldo=(valor+saldo)-GetIntereses1510();
	}
	
	public void retirarValor1510(int valor)
	{
		saldo=(saldo-valor)-GetIntereses1510();
	}
	/* Retorna al saldo del cliente */
	
	public double getSaldo1510()
	{
		return saldo;
	}
}
