package mundo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		boolean continuar = true;
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		while(continuar)
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("\t\tGestión" +
							   "\n1- Ingresar los datos de un nuevo empleado." +
							   "\n2- Mostrar empleados." +
							   "\n0- Salir");
			int opcion = in.nextInt();
			
			switch (opcion) 
			{
				case 0:
					System.out.println("Ha salido correctamente!");
					continuar = false;
					break;
					
				case 1:
					String nombre, apellido, nDocumento;
					int horasTrabajo;
					double Salario;
					
					System.out.println("- Ingrese el nombre del empleado:");
					nombre = in.nextLine();
					nombre = in.nextLine();
					
					System.out.println("- Ingrese el apellido del empleado:");
					apellido = in.nextLine();
					
					System.out.println("- Ingrese el número de documento del empleado:");
					nDocumento = in.nextLine();

					System.out.println("- Ingrese las horas de trabajo del empleado:");
					horasTrabajo = in.nextInt();

					System.out.println("- Ingrese el salario del empleado:");
					Salario = in.nextDouble();
					
					Empleado emp = new Empleado(nombre, apellido, nDocumento, horasTrabajo, Salario);
					System.out.println(emp.toString());
					listaEmpleados.add(emp);
					break;
					
				case 2:
					System.out.println(listaEmpleados);
					break;
	
				default:
					System.out.println("Error: Opción inválida.");
					break;
			}
		}		
	}

}
