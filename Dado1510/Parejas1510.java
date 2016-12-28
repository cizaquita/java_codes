import javax.swing.JOptionPane;


public class Parejas1510 
{
	public static void main(String[] args) 
	{
		dado1510 Dado=new dado1510();
		String valor;
		int nVeces;
		valor=JOptionPane.showInputDialog("Digíte la cantidad de veces que quiere lanzar el dado:");
		nVeces=Integer.parseInt(valor);


		int ParesUno = 0;
		int ParesDos = 0;
		int ParesTres = 0;
		int ParesCuatro = 0;
		
		for(int i=1;i<=nVeces;i++)
		{
			JOptionPane.showMessageDialog(null, "Dado 1 = "+Dado.ValorDado1510()+"\nDado 2 = "+Dado.Valor2Dado1510());
			JOptionPane.showMessageDialog(null, "\n\n\nPares Uno = "+ParesUno+"\nPares Dos = "+ParesDos+"\nPares Tres = "+ParesTres+"\nPares Cuatro = "+ParesCuatro);	
			if(Dado.ValorDado1510() == 1 && Dado.Valor2Dado1510() == 1)
			{		
				//JOptionPane.showMessageDialog(null, "Par de unos, Total = "+ParesUno);
				ParesUno++;				
			}
			
			if(Dado.ValorDado1510() == 2 && Dado.Valor2Dado1510() == 2)
			{
				//JOptionPane.showMessageDialog(null, "Par de dos, Total = "+ParesDos);
				ParesDos++;
			}
			
			if(Dado.ValorDado1510() == 3 && Dado.Valor2Dado1510() == 3)
			{
				//JOptionPane.showMessageDialog(null, "Par de tres, Total = "+ParesTres);
				ParesTres++;
			}			
			
			if(Dado.ValorDado1510() == 4 && Dado.Valor2Dado1510() == 4)
			{
				//JOptionPane.showMessageDialog(null, "Par de cuatro, Total = "+ParesCuatro);
				ParesCuatro++;
			}		
		}
	}
}

