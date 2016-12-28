
// Esta clase representa un punto en el plano 
public class Punto {

// Atributos 
private int x , y ;

// constructor
public Punto (int nx,int ny){
	x=nx ;
	y=ny ;
	}
// metodos 
// devolver el valor x del punto 
public int setx(){
	return x;
}
//devuelve el valor y del punto 
public int sety(){
	return y;
}
//cambia el valor x del punto 
public void getx(int px){
	x=px;
}
//cambia el valor y del punto 
public void gety(int py){
	y=py;
}
}
