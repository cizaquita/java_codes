import javax.swing.*;

public class Runner {

	private String contraseña = "12345";
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void opciones()
	{	
		
		Seno seno=new Seno();
		Funciones funciones=new Funciones();
		EulerPositivo eulerpositivo=new EulerPositivo();
		
		boolean continuar=true;
		while (continuar)
		{
			int Opc= Integer.parseInt(JOptionPane.showInputDialog ("\t\tMenu"+"\n1. Calcular Seno"+"\n2. Calcular Coseno"+"\n3. Calcular Tangente"+"\n4. Calcular Cotangente"+"\n5. Calcular Secante"+"\n6. Calcular Cosecante"+"\n7. Calcular Euler Negativo"+"\n8. Calcular Euler Positivo"+"\n9. Salir"+"\n\n\t\t Digite una opcion"));
			switch (Opc)
			{
			case 9:
			continuar=false;
			JOptionPane.showMessageDialog(null, "\n  \t\t\t         |Fin De La Aplicación| \n By--> Felipe Cediel & Cristian Izaquita ");
			break;

			default :JOptionPane.showMessageDialog(null, "\n  \t Error: opcion no valida"); 
			break;					
			}				
		}	
	}
}
