import java.util.Scanner;


public class ProyectoMenuProgramacion 
{

	public static void main(String[] args) 
	{
		double Password=1510;
		boolean RepMenuPass=false;
		int Intentos=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("\t\b Problemas matemáticos \b\n\r\b Presentado por: Cristian Iván Izaquita Morales.\r\b Presentado a: Sandy Enrique Avella Cely.\r\b Universidad Pedagógica y Tecnológica de Colombia (UPTC).\r\b Mayo 2012 - Sogamoso Boyacá.");
		

		while(RepMenuPass==false)
		{
			double DatoPass;// Si se pone como valor entero, al introducir muchos números saldrá error en programa.
			System.out.println("\n\n Importante: Para accesar a la aplicación introduzca la contraseña:");
			DatoPass=entrada.nextDouble();
			
				if(DatoPass == Password)
				{
					RepMenuPass=true;
					
					int Opcion;
					boolean Continuar=true;
					while (Continuar)
					{
						System.out.println("\n\n\t ..:: Menú ::..");
						System.out.println("\n Importante: Seleccione una Opción:\n\t 1)- Ecuación Cuadrática. \n\t 2)- Horas Extra del Trabajador. \n\t 3)- Pago Matrícula. \n\t 4)- Números Primos. \n\t 5)- Factorial. \n\t 6)- Sumatoria i^2. \n\t 7)- Número e. \n\t 8)- Calcular e^x. \n\t 9-) Salir.");
						Opcion=entrada.nextInt();
					
						switch(Opcion)
						{
			/** Caso uno, Ecuación cuadrática **/
						case 1:		// Valor A, B, C		
							double C1510, R1510, I1510;
							double RaizUnica, ParteReal, ParteImaginaria, RaizReal1, RaizReal2;
							
							System.out.println("Importante: Seleccionó Ecuación Cuadrática:");

							Scanner InValorA=new Scanner(System.in);
							System.out.println("\nInfo: Digíte el valor de A:");
							C1510=InValorA.nextDouble();

							Scanner InValorB=new Scanner(System.in);
							System.out.println("Info: Digíte el valor de B:");
							R1510=InValorB.nextDouble();

							Scanner InValorC=new Scanner(System.in);
							System.out.println("Info: Digíte el valor de C:");
							I1510=InValorC.nextDouble();	
									
							if((Math.pow(R1510,2)-4*C1510*I1510)==0)
							{
								RaizUnica=R1510/(2*C1510);
								System.out.println("Resultado: La ecuación tiene raíz única.\nResultados: La raíz es="+RaizUnica);			
							}
							else
							{
								if((Math.pow(R1510,2)-4*C1510*I1510)<0)
								{
									ParteReal=-R1510/(2*C1510);
									ParteImaginaria=Math.sqrt(Math.abs(Math.pow(R1510,2)-4*C1510*I1510))/(2*I1510);
									System.out.println("Resultado: La ecuación tiene raíces complejas.\nResultado: Parte Real y Parte Imaginaria=\n"+ParteReal+" + "+ParteImaginaria+"\n"+ParteReal+" - "+ParteImaginaria);					
								}
								else
								{
									RaizReal1=(-R1510+Math.sqrt(Math.pow(R1510,2)-4*C1510*I1510))/(2*C1510);
									RaizReal2=(-R1510-Math.sqrt(Math.pow(R1510,2)-4*C1510*I1510))/(2*C1510);		
									System.out.println("Resultado: La ecuación tiene raíces reales.\nResultado: Raíz Real 1= "+RaizReal1+"\nResultado: Raíz Real 2= "+RaizReal2);			
								}
							}	
						break;
						
			/**  Caso dos |Horas Extra del Trabajador| **/				
						case 2: 
							double S1510;
							System.out.println("Importante: Seleccionó Horas Extra del Trabajador:\n");

							Scanner InHoras=new Scanner(System.in);
							System.out.println("Info: Digíte la cantidad de horas trabajadas:");
							C1510=InHoras.nextDouble();	
							
							if(C1510<=40)
							{
								System.out.println("Resultado: El trabajador no tiene horas Extra.");
							}
							else
							{
								if(C1510>40 && C1510<=48)
								{
									C1510=C1510-40;
									R1510=2361;// Pago de hora normal
									I1510=C1510*(R1510*2);
									System.out.println("Resultado: La paga que recivirá el trabajador por las horas trabajadas son = "+I1510);						
								}
								else
								{
									C1510=(C1510-48)*(2361*3);
									I1510=(2361*2)*8;
									S1510=C1510+I1510;
									System.out.println("Resultado: La paga que recivirá el trabajador por las horas trabajadas son = "+S1510);		
								}
							}				
						break;

			/**  Caso tres Estudiantes Pago Matricula **/				
						case 3:
							
							System.out.println("Importante: Seleccionó Pago Matrícula:\n");

							double Promedio, TipoAlumno, Materias, Total, Descuento;

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
									Descuento=((55*180)/5)*0.25;
									Total=((55*180)/5)-Descuento;
									System.out.println("Total: El total a pagar del alumno es: "+Total);
								}	
								else 
									if(Promedio>=9)
									{
										Descuento=((55*180)/5)*0.10;
										Total=((55*180)/5)-Descuento;
										System.out.println("Total: El total a pagar del alumno es: "+Total);				
									}
									else
									{
										if (Promedio>=7)
										{
											Total=(50*180)/5;
											System.out.println("Total: El total a pagar del alumno es: "+Total);
										}	
										else
										{
											Scanner InMaterias=new Scanner(System.in);
											System.out.println("Info: Introduzca el número de materias reprobadas: ");
											Materias=InMaterias.nextDouble();
											if (Materias<=3)
											{
												Total=(45*180)/5;		
												System.out.println("Total: El total a pagar del alumno es: "+Total);			
											}
											else 
												if(Materias>=4)
												{
													Total=(40*180)/5;
													System.out.println("Total: El total a pagar del alumno es: "+Total);
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
										Descuento=((55*300)/5)*0.20;
										Total=((55*300)/5)-Descuento;
										System.out.println("Total: El total a pagar del alumno es: "+Total);
									}
									else
									{
										Total=((55*300)/5);	
										System.out.println("Total: El total a pagar del alumno es: "+Total);				
									}
									System.out.println("Total: El total a pagar del alumno es: "+Total);
								}
								else
								{
									System.out.println("Error: El Tipo del alumno debe ser 1 o 2.");				
								}
							}			
						break;
						
			/** Caso 4, Números primos (N primeros)**/			
						case 4:
							System.out.println("Importante: Seleccionó Números Primos:\n");
							 int numeros = 0;
							 int primo = 1;				 
							 int Contar = 1;
							 
							 boolean esPrimo = false;

							 System.out.println( "Info: ¿Cuántos números primos desea imprimir?");
							 numeros = entrada.nextInt();

							 System.out.println(Contar + ")- " + primo);
							 primo++;

							 while(Contar < numeros)
							 {
								 for(int j = 2; j <= primo; j++)
								 {
									 if(primo != j && primo % j == 0)
									 {
									 esPrimo = false;
									 break;
									 }
									 else
									 {
										 esPrimo = true;
									 }
								 }
								 if(esPrimo == true)
								 {
									 Contar++;
									 System.out.println ( Contar + ")- " + primo);
									 esPrimo = false;
								 }				 
								 primo++;
							 }
						break;
						
			/** Caso 5, Factorial**/			
						case 5:
							
							System.out.println("Importante: Seleccionó Factorial:\n");
							System.out.print("Info: Dígite un valor entero:");
							
							C1510=entrada.nextInt();
							
							if (C1510==0)		
							{
								System.out.print("Resultado: La factorial de 0 = 1");
							}				
							else if (C1510<0)
								{
								System.out.print("Info: Dígite un valor entero:");
								}				
							else 
							{
								R1510=1;
								for (I1510=1;I1510<=C1510;I1510++)								
								R1510=R1510*I1510;
								System.out.print("Resultado: La factorial de "+C1510+" es = "+R1510);								
							}			
						break;
						
			/** Caso 6 Sumatoria i^2 **/			
						case 6:
							
							System.out.println("Importante: Seleccionó Sumatoria i^2:\n");
							System.out.print("Info: Dígite un valor entero:");
							C1510=entrada.nextInt();
							
							if (C1510==0)					
							{
								System.out.print("Error: El valor no puede ser cero (0).");
							}
							
							else if (C1510<0)
									{
									System.out.print("Error: El valor debe ser mayor a cero (0).");
									}			
							else 
							{
								R1510=1;
								for (I1510=1;I1510<=C1510;I1510++)
								R1510=Math.pow(R1510,2)+I1510;
								System.out.print("Resultado: La sumatoria de "+C1510+" es = "+R1510);								
							}			
						break;
						
			/** Caso 7 Número e **/			
						case 7:
							
							System.out.println("Importante: Seleccionó Número e:\n");

							double Sumatoria1;
							System.out.println("Info: Digíte un valor entero:");
							C1510=entrada.nextInt();
							Sumatoria1=C1510*Math.E;
							System.out.println("Resultado: El número 'e' es: "+Sumatoria1);
						
						break;
						
			/** Caso 8 Calcular e^x **/			
						case 8:
							
							System.out.println("Importante: Seleccionó Calculo e^x:\n");
							
							double Sumatoria11;
							System.out.println("Info: Digíte Un Valor Entero: ");
							C1510=entrada.nextInt();
							
							Sumatoria11=Math.pow(Math.E,C1510);
							System.out.println("Resultado: El número e^"+C1510+" es: "+Sumatoria11 );
						
						break;
						
			/** Case 9 = Over **/
						case 9: Continuar=false;
				 		System.out.print("\n\tInfo: Fin de la aplicación.");
				 		System.out.print("\n\t\b\b\b Made by Izaquita1 \b\b\b");
						 
						break;
						
						default :System.out.print("\n\tError: Opción inválida.");
						break;
						}
					}
					
					
				}
				else
				{
					System.out.println("\n\n Error: Contraseña inválida.");	
					Intentos=Intentos+1;					
				}						
				if(Intentos==4)
				{
					System.out.println("\n\n Error: Número de intentos fallidos máximo 4.");
					RepMenuPass=true;
				}
		}
	}
}
