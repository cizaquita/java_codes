import java.util.Scanner;


public class AreaTriangulo 
{
	public static void main(String[] args) 
	{
		/** Variables */
		double lado1, lado2, lado3, area, perimetro;
		
		/** Introducir Datos */
		Scanner Innombre=new Scanner(System.in);
	    System.out.println("Info: Digite su nombre por favor:");
	    String nombre=Innombre.next();

		Scanner Inlado1=new Scanner(System.in);
		System.out.println("Info: Dig�te el lado 1 del tri�ngulo:");
		lado1=Inlado1.nextDouble();
		
		Scanner Inlado2=new Scanner(System.in);;
		System.out.println("Info: Dig�te el lado 2 del tri�ngulo:");
		lado2=Inlado2.nextDouble();
		
		Scanner Inlado3=new Scanner(System.in);;
		System.out.println("Info: Dig�te el lado 3 del tri�ngulo:");
		lado3=Inlado3.nextDouble();
		
		/** Funci�n */
		if (lado1<0)
		{
			System.out.println("Error: Ninguno de los lados puede ser negativo.");
		}		
		else if(lado2<0)
		{
			System.out.println("Error: Ninguno de los lados puede ser negativo.");		
		}
		else if(lado3<0)
		{	
			System.out.println("Error: Ninguno de los lados puede ser negativo.");
		}
		else
			{
			perimetro=lado1+lado2+lado3;
			area=Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
			System.out.println("\nResultados: Per�metro: "+perimetro);
			System.out.println("Resultados: �rea: "+area);		
			System.out.println("Tested by: "+nombre+"\n\n\t**  Owned!  **");
			}
	}

}
