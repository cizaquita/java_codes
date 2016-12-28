import java.util.Scanner;

public class Cristian_Izaquita__201211510
{
	public static void main(String[] args) 
	{

		double Promedio, TipoAlumno, Materias, Total;

		Scanner InPromedio=new Scanner(System.in);
		System.out.println("Info: Dígite el promedio del alumno: ");
		Promedio=InPromedio.nextDouble();

		Scanner InTipoAlumno=new Scanner(System.in);
		System.out.println("Info: Digíte el TipoAlumno del alumno ( 1 o 2 según corresponda), 1 para preparatoria, 2 para Profesional: ");
		TipoAlumno=InTipoAlumno.nextDouble();
		
		if (TipoAlumno == 1)
		{
			if (Promedio>=9.5)
				{
					Total=((55*180)/5)*0.25;
					System.out.println("Total: El total a paga del alumno es: "+Total);
				}	
				else 
					if(Promedio>=9)
					{
						Total=((50*180)/5)*0.10;	
						System.out.println("Total: El total a paga del alumno es: "+Total);				
					}
					else
					{
						if (Promedio>=7)
						{
							Total=(50*180)/5;
							System.out.println("Total: El total a paga del alumno es: "+Total);
						}	
						else
						{
							Scanner InMaterias=new Scanner(System.in);
							System.out.println("Info: Introduzca el número de materias reprobadas: ");
							Materias=InMaterias.nextDouble();
							if (Materias<=3)
							{
								Total=(45*180)/5;		
								System.out.println("Total: El total a paga del alumno es: "+Total);			
							}
							else 
								if(Materias>=4)
								{
									Total=(40*180)/5;
									System.out.println("Total: El total a paga del alumno es: "+Total);
								}
							}
					}
		}
		else
		{
			if(TipoAlumno==2)
			{
				if(Promedio>=9.5)
				{
					Total=((55*300)/5)*0.20;	
					System.out.println("Total: El total a paga del alumno es: "+Total);
				}
				else
				{
					Total=((55*300)/5);	
					System.out.println("Total: El total a paga del alumno es: "+Total);				
				}
				System.out.println("Total: El total a paga del alumno es: "+Total);
			}
			else
			{
				System.out.println("Error: El Tipo del alumno debe ser 1 o 2.");				
			}
		}
	}
}
