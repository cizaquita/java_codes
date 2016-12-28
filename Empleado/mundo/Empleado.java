package mundo;

public class Empleado {
	
	String nombre, apellido, nDocumento;
	int horasTrabajo;
	double Salario;
	
	public Empleado(String nombre, String apellido, String nDocumento, int horasTrabajo, double Salario)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.nDocumento = nDocumento;
		this.horasTrabajo = horasTrabajo;
		this.Salario = Salario;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public String getnDocumento() 
	{
		return nDocumento;
	}

	public void setnDocumento(String nDocumento) 
	{
		this.nDocumento = nDocumento;
	}

	public int getHorasTrabajo() 
	{
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) 
	{
		this.horasTrabajo = horasTrabajo;
	}

	public double getSalario() 
	{
		return Salario;
	}

	public void setSalario(double salario) 
	{
		Salario = salario;
	}	
	
/**
 * ingresos son: bonificaci�n del 7% del sueldo b�sico y las horas extras (n�mero de horas por encima de 40), 
 * que se pagan c/u con el valor normal de la hora m�s un 5% del sueldo b�sico.
 */
	public double calcSueldoNeto()
	{
		double valorHora, valorHoraExtra, pagoExtra, pagoTotal;
		
		//Salario = Salario + (Salario * 7.0);
		//Valor de la hora de trabajo dependiendo al salario mensual.
		
		valorHora = (Salario / 30) / 24;
		valorHoraExtra = valorHora + ((Salario / 100) * 5);
		
		int totalHorasExtra = horasTrabajo - 40;
		
		pagoExtra = totalHorasExtra * valorHoraExtra;
		
		pagoTotal = Salario + ((Salario / 100) * 7) + pagoExtra;
		
		// Egresos
		pagoTotal = pagoTotal - ((pagoTotal / 100) *8);

		return pagoTotal;
	}

	@Override
	public String toString() 
	{
	return "\tEmpleado " +
			"\n[Nombre = " + nombre + ", Apellido = " + apellido
			+ ", N�mero de Documento = " + nDocumento + ", Horas de Trabajo = " + horasTrabajo
			+ ", Salario = $" + Salario + ", Salario Neto = $" + calcSueldoNeto() + "]\n";
	}
	


}
