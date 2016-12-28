


import java.util.ArrayList;



//
//
//@ Date : 04/05/2012
//@ Author : fabian vargas
//esta clase sirve para definir la editorial los descuentos y otras informaciones que solicitan.
//





public class Editorial {
	//declaro los atributos
private int codigoeditorial;
private String nombreeditorial;
private String direccion;
private String telefono;
private float descuentosvolumen;
private ArrayList<Pedido>pedidos;
public Editorial(int codigoeditorial,String nombreeditorial,String direccion, String telefono, float descuentosvolumen) {
	super();
	// TODO Auto-generated constructor stub
        this.codigoeditorial=codigoeditorial;
        this.nombreeditorial=nombreeditorial;
        this.direccion=direccion;
        this.telefono=telefono;
        this.descuentosvolumen=descuentosvolumen;
}
public Editorial(){

}

public int getCodigoeditorial() {
	return codigoeditorial;
}

public String getNombreeditorial() {
	return nombreeditorial;
}

public String getDireccion() {
	return direccion;
}

public String getTelefono() {
	return telefono;
}

public float getDescuentosvolumen() {
	return descuentosvolumen;
}


public void setCodigoeditorial(int codigoeditorial) {
	this.codigoeditorial = codigoeditorial;
}

public void setNombreeditorial(String nombreeditorial) {
	this.nombreeditorial = nombreeditorial;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public void setDescuentosvolumen(float descuentosvolumen) {
	this.descuentosvolumen = descuentosvolumen;
}



@Override
public String toString() {
	return "Editorial [codigoeditorial=" + codigoeditorial
			+ ", nombreeditorial=" + nombreeditorial + ", direccion="
			+ direccion + ", telefono=" + telefono + ", descuentosvolumen="
			+ descuentosvolumen + "]";
}

}
