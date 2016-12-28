/*Esta clase representa la cuenta corriente
 que hace parte de la simulación bancaria de un cliente */


public class Cuenta_Corriente 
{
	//Atributos
	private int Saldo;
	
	// Constructor
	
	
	public Cuenta_Corriente()
	{
		Saldo=0;    /* El Saldo inicial de la cuenta corriente es cero */		
	}
	
	
	/* Consignar una cantidad de dinero en la cuenta del cliente */
	public void ConsignarValor1510(int Valor)
	{
		Saldo=Valor+Saldo;				
	}
	
	/*  Retirar la cantidad de dinero en la cuenta del cliente  */
	public void RetirarValor1510(int Valor)
	{
		Saldo=Saldo-Valor;
	}
	
	/* Retorna al saldo del cliente */
	
	public int GetSaldo1510()
	{
		return Saldo;
	}
	
}
