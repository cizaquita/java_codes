import java.util.Scanner;


public class MenuProgramacion
{
	public static void main(String[] args) 
	{
		int Opcion;
		boolean Continuar=true;
		while (Continuar)
		{		/** Caso Uno |Factorial| **/
			
			System.out.println("\n\n\t ..:: Menú ::..");
			System.out.println("\n Importante: Seleccione una Opcionión:\n\t 1)- Calcular la factorial. \n\t 2)- Sumatoria. \n\t 3) Salir.");		
		
			Scanner entrada=new Scanner(System.in);
			Opcion=entrada.nextInt();
		
			switch(Opcion)
			{
			case 1: int C510,R510,I510;
			
			
			System.out.print("\tInfo: Dígite un valor entero.");
			C510=entrada.nextInt();
			
			if (C510==0)
				
				{
				System.out.print("\t*Resultado: La factorial de 0 = 1");
				System.out.print("\n\t:: Fin del proceso. ::");
				}
			
				else if (C510<0)
					{
					System.out.print("\tInfo: Dígite un valor entero.");
					}
			
				else 
					{
						R510=1;
						for (I510=1;I510<=C510;I510++)
							
							R510=R510*I510;
						System.out.print("\t*Resultado: La factorial de "+C510+" es = "+R510);
						System.out.print("\n\t:: Fin del proceso. ::");
							
					}
			break;
			
			/**  Caso dos |Sumartoria| **/	
			
			case 2: int CC510,II510;// | Número , Sumatoria , Contador |	
			double RR510;
			System.out.print("\tInfo: Dígite un valor entero.");
			CC510=entrada.nextInt();
			
			if (CC510==0)
				
				{
				System.out.print("\tError: El valor no puede ser cero (0).");
				System.out.print("\n\t:: Fin del proceso. ::");
				}
			
				else if (CC510<0)
					{
					System.out.print("\tError: El valor debe ser mayor a cero (0).");
					System.out.print("\n\t:: Fin del proceso. ::");
					}			
				else 
					{
						RR510=1;
						for (II510=1;II510<=CC510;II510++)
							
							RR510=Math.pow(RR510, 2)+II510;
						System.out.print("\t*Resultado: La sumatoria de "+CC510+" es = "+RR510);
						System.out.print("\n\t:: Fin del proceso. ::");
							
					}
			
			break;
		
			case 3: Continuar=false;
			 		System.out.print("\n\tInfo: Fin de la aplicación.");
			 
			break;
			
			default :System.out.print("\n\tError: Opción inválida."); 
			System.out.print("\n\t:: Fin del proceso. ::");
			break;
			}		
		}
	}

}
