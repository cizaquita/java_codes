import javax.swing.JOptionPane;


public class RunnerCuentaBancaria 
{
	public static void main(String[] args) 
	{

		Cuenta_Bancaria Cliente=new Cuenta_Bancaria("Cristian Izaquita", "94082821060");	
		String Valor;
		
		boolean Continuar=true;
		
		while (Continuar)
		{
			
		int OpcionMenu= Integer.parseInt(JOptionPane.showInputDialog ("                      -Menú-" +
				"														\n\n\n<1> Datos Personales." +
				"														\n\n<2> Consignar cuenta Corriente." +
				"														\n\n<3> Retirar Cuenta Corriente." +
				"														\n\n<4> Consignar cuenta Ahorros." +
				"														\n\n<5> Retirar cuenta de Ahorros." +
				"														\n\n<6> Ver Saldo y datos Personales" +
				"														\n\n<7> Salir." +
				"														\n\n\n                 - Digite una opción -"));
			switch(OpcionMenu)
			{
			
			case 1:
				
				/*String Nombre, Cedula;

				Nombre = JOptionPane.showInputDialog("Info:\n Escriba el nombre del cliente: ");
				
				Cedula = JOptionPane.showInputDialog ("Info:\n Escriba la cédula del cliente: ");*/
				
				JOptionPane.showMessageDialog(null, Cliente.Salida());
				
				break;
			
			case 2:
				
				/*String Valor, nombre, cedula;

				nombre = JOptionPane.showInputDialog("Info:\n Escriba el nombre del cliente: ");				
				cedula = JOptionPane.showInputDialog ("Info:\n Escriba la cédula del cliente: ");		*/		
				Valor = JOptionPane.showInputDialog ("Info:\n Digite la cantidad a consignar en la cuenta corriente: ");
				int ConsignaCte = Integer.parseInt(Valor);							
				Cliente.ConsignarCuentaCorriente1510(ConsignaCte);

				JOptionPane.showMessageDialog(null, Cliente.Salida());
				break;
				
				
			case 3:
				Valor = JOptionPane.showInputDialog ("Info:\n Digite la cantidad a retirar en la cuenta corriente: ");
				int RetiraCte = Integer.parseInt(Valor);							
				Cliente.RetirarCuentaCorriente1510(RetiraCte);

				JOptionPane.showMessageDialog(null, Cliente.Salida());
				break;
				
			case 4:
				
				Valor = JOptionPane.showInputDialog ("Info:\n Digite la cantidad a consignar en la cuenta de ahorros: ");
				int ConsignaAhorros = Integer.parseInt(Valor);							
				Cliente.ConsignarCuentaAhorros1510(ConsignaAhorros);

				JOptionPane.showMessageDialog(null, Cliente.Salida());
				
				break;
				
				
			case 5:
				
				Valor = JOptionPane.showInputDialog ("Info:\n Digite la cantidad a retirar en la cuenta de ahorros: ");
				int RetiraAhorros = Integer.parseInt(Valor);							
				Cliente.RetirarCuentaAhorros1510(RetiraAhorros);

				JOptionPane.showMessageDialog(null, Cliente.Salida());
				break;
				
				
			case 6:
				JOptionPane.showMessageDialog(null, Cliente.Salida());
				break;
				
				
			case 7: Continuar=false;
			
						JOptionPane.showMessageDialog(null, "Fin de la aplicación.");
					 
					break;
					
					default :JOptionPane.showMessageDialog(null, "\n\tError: Opción inválida.");
					break;
			}
			
			/*Cuenta_Bancaria Cliente=new Cuenta_Bancaria("Cristian Izaquita", "9797989");			
			Cliente.ConsignarCuentaCorriente1510(1000000);
			Cliente.RetirarCuentaCorriente1510(150000);		
			Cliente.ConsignarCuentaAhorros1510(1000000);
			Cliente.RetirarCuentaAhorros1510(150000);
			
			
			JOptionPane.showMessageDialog(null, Cliente.Salida());*/
			
		}
	}

}
