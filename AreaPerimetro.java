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
		System.out.println("Info: Digíte el radio d la circunferencia:");
		radio=entrada.nextDouble();
		
		/** Función... */ 
		
		if (radio>0)
			{
				/** Define */
				perimetro=2*Math.PI*radio;
				area=Math.PI*Math.pow(radio, 2);
				
				/** Impresión en Consola */
				
				System.out.println("\nRadio: "+radio);
				System.out.println("\nÁrea de la circunferencia con radio "+radio+" es = "+area);
				System.out.println("\nPerímetro de la circunferencia con radio "+radio+" es = "+perimetro);
			}
			else
				System.out.println("Error: El radio negativo, no se pueden calcular el radio ni el perímetro de la circunferencia.\nStupid attempt!");				
	}

}
