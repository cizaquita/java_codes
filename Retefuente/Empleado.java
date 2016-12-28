//ENTIDAD
public class Empleado 
{
	//ATRIBUTOS
	private String Nombre;
	private int Cedula;
	private double Salario;
	private int HorasExtra;//75% de hora normal
	
	//CONSTRUCTOR
	public Empleado(String nNombre, int nCedula, double nSalario, int nHorasExtra)
	{
		
		Nombre=nNombre;
		Cedula=nCedula;
		Salario=nSalario;
		HorasExtra=nHorasExtra;
	}
	
	// Método
	
	public double CalcularRetencion()
	{
		double ReteFuente=0;
		ReteFuente=Salario*0.0586;
		return ReteFuente;
	}

	public double CalcularSalud()
	{
		double Salud=0;
		Salud = Salario*0.0352;
		return Salud;
	}

	public double CalcularSalario()
	{
		double Total=0;
		Total = Salario-CalcularRetencion()-CalcularSalud()+CalcularValorDia();
		return Total;
	}

	public double CalcularValorDia()
	{
		double ValorDia, ValorHora, ValorHorasExtra;
		
		ValorDia = Salario/30;
		ValorHora = ValorDia/8;
		ValorHorasExtra = ((ValorHora*0.75)+ValorHora)*HorasExtra;
		
		return ValorHorasExtra;
	}
	
	// Mostrar el resultado (Método)
	public String Salida()
	{
		String Datos;
		Datos="\n♣ Nombre= "+Nombre+
			  "\n♣ Cedula = "+Cedula+
			  "\n♣ Salario = "+Salario+
			  "\n♣ Retefuente = "+CalcularRetencion()+
			  "\n♣ Descuento por Salud = "+CalcularSalud()+
			  "\n♣ Pago por Horas Extra = "+CalcularValorDia()+
			  "\n♣ Salario Total = "+CalcularSalario();
		return Datos;
	}
}