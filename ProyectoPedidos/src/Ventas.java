

//
//

//@ Date : 04/05/2012
//@ Author : fabian vargas
//@ param esta clase sirve para saber en que consiste la venta el total y su facturacion  de estos pedidos



public class Ventas extends Descripcion{
	//declaro  los atributos
private int codigopedido;
private int codigocliente;
private String fecha;
private String desripcion;

public Ventas(){
	super();
	
}

public Ventas(int codigopedido, int codigocliente, String fecha,
		String desripcion) {
	super();
	this.codigopedido = codigopedido;
	this.codigocliente = codigocliente;
	this.fecha = fecha;
	this.desripcion = desripcion;
}

//creo los metodos de interfas los set y lo get para los atributos

public void setCodigoPedido(int codigopedido) {
	this.codigopedido=codigopedido;

}

public void setCodigoCliente(int codigocliente) {
	this.codigocliente=codigocliente;
}

public void setFecha(String fecha) {
	this.fecha=fecha;

}

public void setDescripcion(String descripcion) {
	this.desripcion=descripcion;

}

public int getCodigoPedido() {
	return codigopedido;

}

public int getCodigoCliente() {
	return codigocliente;

}


public String getFecha() {
	return fecha;

}

public String getDescripcion() {
	return desripcion;

}

@Override
public String toString() {
	return "[codigopedido = " + codigopedido + ", codigocliente  =  "
			+ codigocliente + ", fecha = " + fecha + ", desripcion = " + desripcion
			+ " ] ";
}
}
