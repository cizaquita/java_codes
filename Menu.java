import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contraseña1 = 0000;
		Scanner entrada=new Scanner(System.in);
		
		boolean contraseña = false;
		while(contraseña==false){
			System.out.println("Digite Su contraseña");
			int valor = entrada.nextInt();
			if(valor == contraseña1){
				contraseña = true;
			}
		}

		if(contraseña == true){
			int opc;
			boolean continuar=true;
			while (continuar)
			{
				double f706,e706,l706,i706;

				System.out.println("\t MENU");
				System.out.println("\t<1.>Ecuacion Cuadratica");
				System.out.println("\t<2.>Horas extras trabajador");
				System.out.println("\t<3.>Pago estudiantes");
				System.out.println("\t<4.>Numeros primos");
				System.out.println("\t<5.>Factorial");
				System.out.println("\t<6.>Sumatoria i cuadrado");
				System.out.println("\t<7.>Numero e");
				System.out.println("\t<8.>Numero E^");
				System.out.println("\t<9.>Salir");

				System.out.print("\t\t Digite una opcion:");

				opc=entrada.nextInt();
				switch(opc)
				{
				case 1: 

					System.out.println("Digite a");
					f706 = entrada.nextInt();
					System.out.println("Digite b");
					e706 = entrada.nextInt();
					System.out.println("Digite c");
					l706 = entrada.nextInt();

					i706 = (-e706 + Math.sqrt((e706 * e706) - (4 * f706 * l706))) / (2 * f706 );
					System.out.println("El primer resultado es = "+i706);

					i706 = (-e706 - Math.sqrt((e706 * e706) - (4 * f706 * l706))) / (2 * f706 );
					System.out.println("El segundo resultado es ="+i706);
					break;
					
					//_____________________________________________________________________
					
					
				case 2:
					System.out.println("digite la cantidad de horas trabajadas");
					f706 = entrada.nextDouble();

					if(f706<=40){
						System.out.println("el trabajador no tiene horas extras trabajadas ");
					}
					else {
						if (f706 > 40&& f706 <= 48){
							f706 = f706 - 40;
							e706 = 2361;
							l706 = f706*(e706*2);

							System.out.println("el valor que recibira el trabajador por concepto de horas trabajadas es="+l706);  
						}
						else {
							f706 = (f706 - 48) * (2361 * 3) ;
							l706 = (2361*2) * 8;
							i706 = f706+l706;
							System.out.println("el valor que recibira el trabajador por concepto de horas trabajadas es="+i706);
						}
					}

					break;
				case 3:

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
					break;
				case 4:
					System.out.println("digite un numero");
					f706=entrada.nextDouble();
					boolean esprimo=true;
					for (int i=2;i<f706;i++){
						e706= f706 % i ;
						if(e706==0){
							esprimo=false;
						}
					}
					if (esprimo==true){
						System.out.println("el numero es primo");
					}
					if (esprimo==false){
						System.out.println("el numero no es primo");
					}
					break;
				case 5:

					System.out.println("Digite un valor entero");
					f706=entrada.nextInt();
					if (f706==0)
						System.out.println("el factorial de 0 es =1");
					else
						if (f706<0){
							System.out.println("error , no existe factorial para numeros negativos");
						}else{
							e706=1;
							for(l706=1;l706<=f706;l706++)
								e706=e706*l706;
							System.out.println("el factorial de "+f706+"="+e706 );

						}
					break;
				case 6:
					System.out.println("Digite un numero para realizar la sumatoria");
					f706=entrada.nextInt();
					if(f706 < 0){
						System.out.println("No existe sumatoria para numeros negativos");
					}else{
						e706 = 0;
						for (int i = 1; i <= f706; i++) {
							e706 = e706 + (i * i);
						}
						System.out.println("la sumatoria de "+f706+" es = "+e706);
					}
					break;
				case 7:
					System.out.println("Digite un valor entero");
					f706=entrada.nextInt();
					double sumatoria = 0;
					for(int i = 0; i < f706;i++){				
						e706=1;
						for(l706=1;l706<=f706;l706++){
							e706=e706*l706;

						}
						sumatoria = sumatoria + 1/e706;
					}
					System.out.println("el numero e es : "+sumatoria);

					break;
				case 8:
					System.out.println("Digite un valor entero");
					f706=entrada.nextInt();
					double sumatoria1 = 0;
					for(int i = 0; i < f706;i++){				
						e706=1;
						for(l706=1;l706<=f706;l706++){
							e706=e706*l706;

						}
						sumatoria1 = sumatoria1 + 1/e706;
					}
					double resultado = 1;
					for(int i = 0 ;i <f706;i++){
						resultado = resultado * sumatoria1;
					}
					System.out.println("el numero E^ es :"+resultado );
					break;
				case 9:System.out.println("FIN DEL PROGRAMA ... BY FELIPE CEDIEL");
				continuar=false;

				break;
				default : System.out.println("Error , opcion no valida");
				break;

				}//fin switch
			}
		}
		else{
			System.out.println("La contraseña no fue ingresada correctamente");

		}//fin main
	}//fin while
}//fin class