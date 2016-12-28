import javax.swing.JOptionPane;


public class RunnerAlcancia 
{
	public static void main(String[] args) 
	{
		
		boolean Continuar=true;
		Alcancia UnaAlcancia=new Alcancia();
		
		while (Continuar)
		{
		int OpcionMenu= Integer.parseInt(JOptionPane.showInputDialog ("                       -Men�-" +
				"														\n\n\n<1> Agregar moneda de 100 a la alcanc�a." +
				"														\n\n<2> Agregar moneda de 200 a la alcanc�a." +
				"														\n\n<3> Agregar moneda de 500 a la alcanc�a." +
				"														\n\n<4> Contar n�mero de monedas." +
				"														\n\n<5> Calcular el Total de dinero de la alcanc�a." +
				"														\n\n<6> Rompe Alcanc�a." +
				"														\n\n<7> Reiniciar Alcanc�a." +
				"														\n\n<8> Salir." +
				"														\n\n\n                - Digite una opci�n -"));
			switch(OpcionMenu)
			{
			
			case 1:
				UnaAlcancia.AgregarMoneda100();

				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 100 a la alcanc�a." +
													"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas100());	
				
				
				break;
			
			case 2:
				UnaAlcancia.AgregarMoneda200();
				
				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 200 a la alcanc�a." +
						 							"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas200());	
				
				
				break;
				
				
			case 3:
				UnaAlcancia.AgregarMoneda500();
				
				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 500 a la alcanc�a." +
													"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas500());	
				
				break;
				
			case 4:
				
				JOptionPane.showMessageDialog(null, UnaAlcancia.getListadoAlcancia());
				break;
				
				
			case 5:
				
				JOptionPane.showMessageDialog(null, "Total de dinero ahorrado en la alcanc�a = "+UnaAlcancia.getTotalDinero());
				break;
				
				
			case 6:
				JOptionPane.showMessageDialog(null, UnaAlcancia.getRomperAlcancia());
				break;
				
				
			case 7: 	
				
				UnaAlcancia.IniciarAlcancia();
				JOptionPane.showMessageDialog(null, "Info: Ha reiniciado la alcanc�a.");	
				break;
				
				
			case 8: 
				
				Continuar=false;
				JOptionPane.showMessageDialog(null, "Fin de la aplicaci�n.");			
					break;
			default:
					JOptionPane.showMessageDialog(null, "\n\tError: Opci�n inv�lida.");
				break;
			}
		}
	}

}
