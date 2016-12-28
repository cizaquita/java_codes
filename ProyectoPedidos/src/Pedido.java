



//
//  
//
//  @ File Name : Pedido.java
//  @ Date : 04/05/2012
//  @ fabian vargas : 
//
//




public class Pedido {
	
		// TODO Auto-generated constructor stub
	
	// declaro los atributos
	private int codigopedido;	
	private String descripcion;
	private String fecha;
	private float total;
	private String estado;
	private String direccionenvio;
	private Descripcion descripcio1;
	public Pedido() {
		super();
	

		// TODO Auto-generated constructor stub
	}	

	public Pedido(int codigopedido, String descripcion, String fecha,
			float total, String direccionenvio,String estado) {
		super();
		this.codigopedido = codigopedido;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.total = total;
	
		this.direccionenvio = direccionenvio;
		this.estado=estado;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	public String getEstado(){
		return estado;
		
	}
	
	public int getCodigopedido() {
		return codigopedido;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getFecha() {
		return fecha;
	}


	public float getTotal() {
		return total;
	}


	

	public String getDireccionenvio() {
		return direccionenvio;
	}


	public Descripcion getDescripcio1() {
		return descripcio1;
	}


	public void setCodigopedido(int codigopedido) {
		this.codigopedido = codigopedido;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public void setTotal(float total) {
		this.total = total;
	}




	public void setDireccionenvio(String direccionenvio) {
		this.direccionenvio = direccionenvio;
	}


	public void setDescripcio1(Descripcion descripcio1) {
		this.descripcio1 = descripcio1;
	}

	@Override
	public String toString() {
		return "Pedido [codigopedido=" + codigopedido + ", descripcion="
				+ descripcion + ", fecha=" + fecha + ", total=" + total
				 + ", direccionenvio="
				+ direccionenvio + ", descripcio1=" + descripcio1 + "+estado"+estado+"]";
	}

}
