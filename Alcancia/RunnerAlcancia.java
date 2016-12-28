import javax.swing.JOptionPane;


public class RunnerAlcancia 
{
	public static void main(String[] args) 
	{
		
		boolean Continuar=true;
		Alcancia UnaAlcancia=new Alcancia();
		
		while (Continuar)
		{
		int OpcionMenu= Integer.parseInt(JOptionPane.showInputDialog ("                       -Menú-" +
				"														\n\n\n<1> Agregar moneda de 100 a la alcancía." +
				"														\n\n<2> Agregar moneda de 200 a la alcancía." +
				"														\n\n<3> Agregar moneda de 500 a la alcancía." +
				"														\n\n<4> Contar número de monedas." +
				"														\n\n<5> Calcular el Total de dinero de la alcancía." +
				"														\n\n<6> Rompe Alcancía." +
				"														\n\n<7> Reiniciar Alcancía." +
				"														\n\n<8> Salir." +
				"														\n\n\n                - Digite una opción -"));
			switch(OpcionMenu)
			{
			
			case 1:
				UnaAlcancia.AgregarMoneda100();

				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 100 a la alcancía." +
													"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas100());	
				
				
				break;
			
			case 2:
				UnaAlcancia.AgregarMoneda200();
				
				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 200 a la alcancía." +
						 							"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas200());	
				
				
				break;
				
				
			case 3:
				UnaAlcancia.AgregarMoneda500();
				
				JOptionPane.showMessageDialog(null, "Info: Ha agregado una moneda de 500 a la alcancía." +
													"\n\nTotal de monedas de 100 = "+UnaAlcancia.GetNumeroMonedas500());	
				
				break;
				
			case 4:
				
				JOptionPane.showMessageDialog(null, UnaAlcancia.getListadoAlcancia());
				break;
				
				
			case 5:
				
				JOptionPane.showMessageDialog(null, "Total de dinero ahorrado en la alcancía = "+UnaAlcancia.getTotalDinero());
				break;
				
				
			case 6:
				JOptionPane.showMessageDialog(null, UnaAlcancia.getRomperAlcancia());
				break;
				
				
			case 7: 	
				
				UnaAlcancia.IniciarAlcancia();
				JOptionPane.showMessageDialog(null, "Info: Ha reiniciado la alcancía.");	
				break;
				
				
			case 8: 
				
				Continuar=false;
				JOptionPane.showMessageDialog(null, "Fin de la aplicación.");			
					break;
			default:
					JOptionPane.showMessageDialog(null, "\n\tError: Opción inválida.");
				break;
			}
		}
	}

}
