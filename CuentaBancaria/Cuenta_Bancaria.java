/** Ésta Clase representa los datos del cliente del banco **/
public class Cuenta_Bancaria 
{

	
	// Atributos
	private String Nombre, Cedula;
	
	
	/** Cuenta corriente del cliente **/
	
	private Cuenta_Corriente CuentaCorriente1510;
	
	private Cuenta_Ahorros CuentaAhorros1510;
	
	// Constructor
	/* Inicializa cuenta corriente con la informacion básica */
	public Cuenta_Bancaria(String nNombre, String nCedula)
	{
		Nombre=nNombre;
		Cedula=nCedula;
		
		CuentaAhorros1510=new Cuenta_Ahorros();
		CuentaCorriente1510=new Cuenta_Corriente();
	}
	
	public String GetNombre1510()
	{
		return Nombre;
	}
	
	public String GetCedula1510()
	{
		return Cedula;
	}
	
	// De tipo Cuenta_Corriente

	Cuenta_Corriente GetCuentaCorriente1510()
	{
		return CuentaCorriente1510;
	}
	
	//Get Cuenta Ahorros
	Cuenta_Ahorros GetCuentaAhorros1510()
	{
		return CuentaAhorros1510;
	}

	// Consigna un valor en la cuenta corriente
	public void ConsignarCuentaCorriente1510(int Valor)
	{
		CuentaCorriente1510.ConsignarValor1510(Valor);
	}
	
	// Consigna un valor en la cuenta ahorros
	public void ConsignarCuentaAhorros1510(int Valor)
	{
		CuentaAhorros1510.consignarValor1510(Valor);
	}
	
	public void RetirarCuentaCorriente1510(int Valor)
	{
		CuentaCorriente1510.RetirarValor1510(Valor);
	}
	
	public void RetirarCuentaAhorros1510(int Valor)
	{
		CuentaAhorros1510.retirarValor1510(Valor);
	}
	
	//Retorna la salida de los datos 
		
	public String Salida()
	{

		String Datos;
		Datos="              ..:: BANCO ::.. " +
		      "\n\n Nombre Cliente = "+ GetNombre1510() +
			  "\n Cédula Cliente = "+ GetCedula1510() +
			  "\n Saldo Cuenta Cte. = "+ CuentaCorriente1510.GetSaldo1510()+
			  "\n Saldo Ahorros = "+CuentaAhorros1510.getSaldo1510()+
			  "\n\n             ..:: BANCO ::.. ";
		return Datos;
		
	}
}
