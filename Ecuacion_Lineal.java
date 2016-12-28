import java.util.Scanner;


public class Ecuacion_Lineal 
{
	
	public static void main(String[] args) 
	{
		/** Variables */
		double a, b, x;

		Scanner InValorA=new Scanner(System.in);
		System.out.println("Info: Digíte el valor de A:");
		a=InValorA.nextDouble();

		Scanner InValorB=new Scanner(System.in);
		System.out.println("Info: Digíte el valor de B:");
		b=InValorB.nextDouble();
		
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Error: El resultado es indeterminado.");
			}	
			else
			{
				System.out.println("Error: El resultado no tiene solución.");				
			}
		}
		else
		{
			x=-b/a;
			System.out.println("\nResultado: X = "+x);	
		}	
	}

}
