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
			int Opcion= Integer.parseInt(JOptionPane.showInputDialog("\n\n\t                     ..:: Men� ::.." +
					"\n Importante: Seleccione una Opci�n:\n" +
					"\n\t 1) A�o Bisiesto. " +
					"\n\t 2) Calcular la factorial. " +
					"\n\t 3) Suma de enteros. " +
					"\n\t 4) Calculo consumo Combustible." +
					"\n\t 5) Salir.\n\n"));	
		
		
			switch(Opcion)
			{
			case 1:

				JOptionPane.showMessageDialog(null, "  A�o Bisiesto.");
				int A�o= Integer.parseInt(JOptionPane.showInputDialog("* Dig�te el a�o:"));
				int NumeroDias=0;
				if(((A�o%4==0)&&!(A�o%100==0))||(A�o%400==0))
				{
					NumeroDias=29;
					JOptionPane.showMessageDialog(null, " El A�o es Bisiesto.");
				}
				else
				{
					NumeroDias=28;
					JOptionPane.showMessageDialog(null, " El A�o NO es Bisiesto.");
				}				
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "  Calcular la factorial. ");


				int Numero= Integer.parseInt(JOptionPane.showInputDialog("* Dig�te el n�mero:"));
				
				double Resultado=1;
				
				for(double Contador=1;Contador<=Numero;Contador++)
				{
					Resultado=Resultado*Contador;
				}			
				JOptionPane.showMessageDialog(null, "** El Factorial de "+Numero+" es: "+Resultado);	
				
			break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "  Suma de enteros. ");	
				
				int NumSuma= Integer.parseInt(JOptionPane.showInputDialog("* Dig�te el n�mero hasta donde desea sumar:"));
				int suma=0;
				for(int i=1;i<=NumSuma;i++)
				{
					suma=suma+i;
				}
				JOptionPane.showMessageDialog(null, "** La Sumatoria de "+NumSuma+" es: "+suma);	
				
			break;
			
			case 4:	
				JOptionPane.showMessageDialog(null, "Calculo consumo Combustible.");
				
				double Kilometros= Integer.parseInt(JOptionPane.showInputDialog("* Dig�te los kilometros a recorrer:"));
				
				double Galones;
				
				Galones=(Kilometros*1)/40;
				double Valor=Galones*9000;
				
				JOptionPane.showMessageDialog(null, "** Galones Consumidos: "+Galones+"\n** Valor del viaje es: $"+Valor);
				
				
			break;
			
			case 5: 
				Continuar=false;
				JOptionPane.showMessageDialog(null, "** Fin del Programa **" +
						"\n\n\n** Cristian Iv�n Izaquita M. **" +
						"\n** 201211510 **");
				
			break;

			default:
				JOptionPane.showMessageDialog(null, "\n\t Error: Opci�n inv�lida.");
			break;
			}
		}
	}

}

