import java.util.Scanner;


public class ParcialFibonacci 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{		
		// TODO Auto-generated method stub		
		

		int nDato;
		Scanner entrada=new Scanner(System.in);		
		System.out.println("\nIngrese el número de números a visualizar de la serie Fibonacci:");
		nDato=entrada.nextInt();		
		
		if(nDato>=2)
		{
			int a=1, b=0, Total=0, ElTotal=0;
			
			for(int Contador =0;Contador<=nDato;Contador++)
			{
				Total=a+b;
				a=b;
				b=Total;
				System.out.println("\n"+Total+" + ");
			}
			ElTotal=Total-1;
			System.out.println("\nResultado = "+ElTotal);
			
		}
		else
		{
			System.out.println("Error: Número inválido ");
		}
		
		


	}

}
