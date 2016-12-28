import java.util.Scanner;


public class Pablito_Escobar_CA 
{
	public static void main(String[] args) 
	{
		int PrimerNum, SegundoNum, TercerNum, Num1, Num2, Num3;

		Scanner entrada=new Scanner(System.in);
		System.out.println("\nInfo: Digíte el 'primer' número mayor a 0, menor o igual a 9:");
		PrimerNum=entrada.nextInt();
		
		System.out.println("\nInfo: Digíte el 'segundo' número de 0 a 9:");
		SegundoNum=entrada.nextInt();
		
		System.out.println("\nInfo: Digíte el 'tercer' número de 0 a 9:");
		TercerNum=entrada.nextInt();
		
		if(PrimerNum>=1 && PrimerNum<=9 && SegundoNum>=0 && SegundoNum<=9 && TercerNum>=0 && TercerNum<=9)
		{
			for(int i=100;i<=999;i++)
			{
				Num1=(int) (Math.random()*PrimerNum);
				Num2=(int) (Math.random()*SegundoNum);
				Num3=(int) (Math.random()*TercerNum);		
				System.out.println("\nResultado: "+Num1+Num2+Num3);	
			}
			
		}
		else
		{
			System.out.println("\nError: Ha introducido los valores mal.");				
		}
	}

}
