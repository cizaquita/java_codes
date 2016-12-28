import javax.swing.JOptionPane;


public class Runer 
{

	public static void main(String[] args) 
	{
		Empleado empleado1=new Empleado("Juan Carlos Vargas", 9610420, 5500300, 17);

		Empleado empleado2=new Empleado("Don Cristian Izaquita", 940828, 9999999, 10);
		
		Empleado empleado3=new Empleado("Armando Paredes", 123456, 5541020, 10);

		JOptionPane.showMessageDialog(null, empleado1.Salida());

		JOptionPane.showMessageDialog(null, empleado2.Salida());
		
		JOptionPane.showMessageDialog(null, empleado3.Salida());
	}

}