import java.util.Scanner;


public class Promedio 
{
	public static void main(String[] args) 
	{
		double Datos, Contador, Valores, Promedio, Suma;
		
		Scanner InDatos=new Scanner(System.in);
		System.out.println("Importante: Ingrese el número de datos: ");
		Datos=InDatos.nextDouble();
		
		if(Datos>0)
		{
			Suma=0;
			
			for(Contador=1;Contador<=Datos;Contador++)
			{
				System.out.println("Info: Ingrese el "+Contador+"' valor de tipo Real: ");
				
				Scanner InValores=new Scanner(System.in);
				Valores=InValores.nextDouble();
				Suma=Valores+Suma;				
			}
			Promedio=Suma/Datos;
			System.out.println("Info: La suma es = "+Suma+" y promedio es ="+Promedio);	
			System.out.println("Made by: \n\n\t**  \b\b\b Izaquita1! \b\b\b  **");			
		}
		else
		{
			System.out.println("Error: El número de datos no puede ser cero ni menor.");
		}
	}

}
