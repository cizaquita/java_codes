import java.util.Scanner;


public class Cuadratica 
{
	public static void main(String[] args) 
	{
		
		double a, b, c;
		double RaizUnica, ParteReal, ParteImaginaria, RaizReal1, RaizReal2;

		Scanner InValorA=new Scanner(System.in);
		System.out.println("Info: Dig�te el valor de A:");
		a=InValorA.nextDouble();

		Scanner InValorB=new Scanner(System.in);
		System.out.println("Info: Dig�te el valor de B:");
		b=InValorB.nextDouble();

		Scanner InValorC=new Scanner(System.in);
		System.out.println("Info: Dig�te el valor de C:");
		c=InValorC.nextDouble();	
				
		if((Math.pow(b,2)-4*a*c)==0)
		{
			RaizUnica=b/(2*a);
			System.out.println("Resultado: La ecuaci�n tiene ra�z �nica.\nResultados: La ra�z es="+RaizUnica);			
		}
		else
		{
			if((Math.pow(b,2)-4*a*c)<0)
			{
				ParteReal=-b/(2*a);
				ParteImaginaria=Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(2*a);
				System.out.println("Resultado: La ecuaci�n tiene ra�ces complejas.\nResultado: Parte Real y Parte Imaginaria=\n"+ParteReal+" + "+ParteImaginaria+"\n"+ParteReal+" - "+ParteImaginaria);					
			}
			else
			{
				RaizReal1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
				RaizReal2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);		
				System.out.println("Resultado: La ecuaci�n tiene ra�ces reales.\nResultado: Ra�z Real 1= "+RaizReal1+"\nResultado: Ra�z Real 2= "+RaizReal2);			
			}
		}
	}
}
