import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Vector; 

public class Combinaciones { 
public static void main(String []args){ 
try{ 
BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("cuantos n�meros desea ingresar"); 
int largo = Integer.parseInt(teclado.readLine()); 
Vector vector= new Vector(); 
for (int i = 0; i < largo; i++) { 
System.out.print("Ingrese " + (i+1) +"� Numero: "); 
vector.add(Integer.parseInt(teclado.readLine())); 
} 
String inicio = vector.toString(); 
String fin = ""; 
int i = largo - 1; 
while(!inicio.equals(fin)){ 
System.out.println(vector.toString()); 
if(i>0){ 
Object aux = vector.get(i); 
vector.set(i, vector.get(i-1)); 
vector.set(i-1, aux); 
i--; 
} 
if(i==0){ 
i= largo - 1; 
} 
fin = vector.toString(); 
} 
}catch(IOException e){ 
e.printStackTrace(); 
}catch(NumberFormatException e1){ 
System.out.println("Numero Inv�lido"); 
} 
} 

}







































