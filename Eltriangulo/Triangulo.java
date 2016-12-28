
public class Triangulo {

//Atributos 
	//primer punto del triangulo
	private Punto punto1;
	//segundo punto del triangulo
		private Punto punto2;
		//tercer punto del triangulo
		private Punto punto3;

//Constructor 
public Triangulo(){
	punto1=new Punto(1,1);
	punto2=new Punto(3,1);
	punto3=new Punto(2,4);
}
//metodos
//devuelve el punto 1 del triangulo 
public Punto setPunto1(){
	return punto1;
	}
//devuelve el punto 1 del triangulo 
public Punto setPunto2(){
	return punto2;
}
	//devuelve el punto 1 del triangulo 
	public Punto setPunto3(){
		return punto3;
	}
// calcular la distancia del punto 1 al punto 2
	
public double calcularLado1(){
	return distancia1;
	
}
//calcular restas 
double valorx = Math.pow(punto1.setx()-punto2.setx(),2);
double valory = Math.pow(punto1.sety()-punto2.sety(),2);

//calcular distancia
double distancia1=Math.sqrt(valorx-valory);

//calcular la distancia del punto 2 al punto 3

public double calcularLado2(){
	return distancia1;
	
}
//calcular restas 
double valorxx = Math.pow(punto2.setx()-punto3.setx(),2);
double valoryy = Math.pow(punto2.sety()-punto3.sety(),2);

//calcular distancia
double distancia2=Math.sqrt(valorxx-valoryy);

//calcular la distancia del punto 3 al punto 1

public double calcularLado3(){
	return distancia3;
	
}
//calcular restas 
double valorxxx = Math.pow(punto3.setx()-punto1.setx(),2);
double valoryyy = Math.pow(punto3.sety()-punto1.sety(),2);

//calcular distancia
double distancia3=Math.sqrt(valorxxx-valoryyy);

//devuelve el perimetro del triangulo
public double calcularPerimetro() {
return calcularLado1()+calcularLado2()+calcularLado3();
}
//devuelve el area del triangulo
public double calcularArea(){
 //semiperimetro
double s=calcularPerimetro()/2 ;
//calcula las restas de cada uno de los lados 
double valorLado1=s-calcularLado1();
double valorLado2=s-calcularLado2();
double valorLado3=s-calcularLado3();
double area = Math.sqrt(s*valorLado1*valorLado2*valorLado3);
return area ;
}
//calcular altura 
public double calcularAltura(){
double altura=(2*calcularArea())/calcularLado1();
return altura ;
}









//public double calcularAltura();
//String Salida();
}
