




//
//@ File Name : Descripcion.java
//@ Date : 04/05/2012
//@ Author : fabian vargas
//
//
/**
 * @version1.0
 * @param esta clase sirve para definir la descripcion de el pedido 
 */



public class Descripcion {
	

//declaro los atributos codigopedido,codigoeditorial, codigo editorial, titulo,tema.
private int codigopedido;
private int codigoeditorial;
private int codigolibro;
private String titulo;
private String tema;

public Descripcion() {
	super();
	// TODO Auto-generated constructor stub
}

public Descripcion(int codigopedido, int codigoeditorial, int codigolibro,
		String titulo, String tema) {
	super();
	this.codigopedido = codigopedido;
	this.codigoeditorial = codigoeditorial;
	this.codigolibro = codigolibro;
	this.titulo = titulo;
	this.tema = tema;
}

//creo los metodos de interfas los set y lo get para los atributos
public void setCodigoPedido(int codigopedido) {
	this.codigopedido=codigopedido;

}

public void setCodigoEditorial(int codigoeditorial) {
	this.codigoeditorial=codigoeditorial;
}

public void setCodigoLibro(int codigolibro) {
	this.codigolibro=codigolibro;

}

public void setTitulo(String titulo) {
	this.titulo=titulo;

}

public void setTema(String tema) {
	this.tema=tema;

}

public int getCodigoPedido() {
	return codigopedido;

}

public int getCodigoEditorial() {
	return codigoeditorial;

}

public int getCodigoLibro() {
	return codigolibro;

}

public String getTitulo() {
	return titulo;

}

public String getTema() {
	return tema;

}
@Override
public String toString() {
	return "[codigopedido =  " + codigopedido
			+ " , codigoeditorial =  " + codigoeditorial + ", codigolibro  =  "
			+ codigolibro + ", titulo  =  " + titulo + ", tema  =   " + tema +  "]";
}
}
