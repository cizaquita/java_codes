import java.util.Scanner;


public class AreaPerimetro 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**  Variables   */
		
		double radio, perimetro, area;

		Scanner entrada=new Scanner(System.in);
		System.out.println("Info: Dig�te el radio d la circunferencia:");
		radio=entrada.nextDouble();
		
		/** Funci�n... */ 
		
		if (radio>0)
			{
				/** Define */
				perimetro=2*Math.PI*radio;
				area=Math.PI*Math.pow(radio, 2);
				
				/** Impresi�n en Consola */
				
				System.out.println("\nRadio: "+radio);
				System.out.println("\n�rea de la circunferencia con radio "+radio+" es = "+area);
				System.out.println("\nPer�metro de la circunferencia con radio "+radio+" es = "+perimetro);
			}
			else
				System.out.println("Error: El radio negativo, no se pueden calcular el radio ni el per�metro de la circunferencia.\nStupid attempt!");				
	}

}
