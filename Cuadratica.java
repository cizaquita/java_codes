import java.util.Scanner;


public class Cuadratica 
{
	public static void main(String[] args) 
	{
		
		double a, b, c;
		double RaizUnica, ParteReal, ParteImaginaria, RaizReal1, RaizReal2;

		Scanner InValorA=new Scanner(System.in);
		System.out.println("Info: Digíte el valor de A:");
		a=InValorA.nextDouble();

		Scanner InValorB=new Scanner(System.in);
		System.out.println("Info: Digíte el valor de B:");
		b=InValorB.nextDouble();

		Scanner InValorC=new Scanner(System.in);
		System.out.println("Info: Digíte el valor de C:");
		c=InValorC.nextDouble();	
				
		if((Math.pow(b,2)-4*a*c)==0)
		{
			RaizUnica=b/(2*a);
			System.out.println("Resultado: La ecuación tiene raíz única.\nResultados: La raíz es="+RaizUnica);			
		}
		else
		{
			if((Math.pow(b,2)-4*a*c)<0)
			{
				ParteReal=-b/(2*a);
				ParteImaginaria=Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(2*a);
				System.out.println("Resultado: La ecuación tiene raíces complejas.\nResultado: Parte Real y Parte Imaginaria=\n"+ParteReal+" + "+ParteImaginaria+"\n"+ParteReal+" - "+ParteImaginaria);					
			}
			else
			{
				RaizReal1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
				RaizReal2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);		
				System.out.println("Resultado: La ecuación tiene raíces reales.\nResultado: Raíz Real 1= "+RaizReal1+"\nResultado: Raíz Real 2= "+RaizReal2);			
			}
		}
	}
}
