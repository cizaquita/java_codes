package Defecto;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Menu 
{	
	public static void main(String[] args) 
	{

		boolean Continuar=true;
		while (Continuar)
		{
			int Opcion= Integer.parseInt(JOptionPane.showInputDialog("\n\n\t                     ..:: Menú ::.." +
					"\n Importante: Seleccione una Opción:\n" +
					"\n\t 1) Año Bisiesto. " +
					"\n\t 2) Calcular la factorial. " +
					"\n\t 3) Suma de enteros. " +
					"\n\t 4) Calculo consumo Combustible." +
					"\n\t 5) Salir.\n\n"));	
		
		
			switch(Opcion)
			{
			case 1:

				JOptionPane.showMessageDialog(null, "  Año Bisiesto.");
				int Año= Integer.parseInt(JOptionPane.showInputDialog("* Digíte el año:"));
				int NumeroDias=0;
				if(((Año%4==0)&&!(Año%100==0))||(Año%400==0))
				{
					NumeroDias=29;
					JOptionPane.showMessageDialog(null, " El Año es Bisiesto.");
				}
				else
				{
					NumeroDias=28;
					JOptionPane.showMessageDialog(null, " El Año NO es Bisiesto.");
				}				
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "  Calcular la factorial. ");


				int Numero= Integer.parseInt(JOptionPane.showInputDialog("* Digíte el número:"));
				
				double Resultado=1;
				
				for(double Contador=1;Contador<=Numero;Contador++)
				{
					Resultado=Resultado*Contador;
				}			
				JOptionPane.showMessageDialog(null, "** El Factorial de "+Numero+" es: "+Resultado);	
				
			break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "  Suma de enteros. ");	
				
				int NumSuma= Integer.parseInt(JOptionPane.showInputDialog("* Digíte el número hasta donde desea sumar:"));
				int suma=0;
				for(int i=1;i<=NumSuma;i++)
				{
					suma=suma+i;
				}
				JOptionPane.showMessageDialog(null, "** La Sumatoria de "+NumSuma+" es: "+suma);	
				
			break;
			
			case 4:	
				JOptionPane.showMessageDialog(null, "Calculo consumo Combustible.");
				
				double Kilometros= Integer.parseInt(JOptionPane.showInputDialog("* Digíte los kilometros a recorrer:"));
				
				double Galones;
				
				Galones=(Kilometros*1)/40;
				double Valor=Galones*9000;
				
				JOptionPane.showMessageDialog(null, "** Galones Consumidos: "+Galones+"\n** Valor del viaje es: $"+Valor);
				
				
			break;
			
			case 5: 
				Continuar=false;
				JOptionPane.showMessageDialog(null, "** Fin del Programa **" +
						"\n\n\n** Cristian Iván Izaquita M. **" +
						"\n** 201211510 **");
				
			break;

			default:
				JOptionPane.showMessageDialog(null, "\n\t Error: Opción inválida.");
			break;
			}
		}
	}

}

