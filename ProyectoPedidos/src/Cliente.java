


//
//
//  @ File Name : Cliente.java
//  @ Date : 04/05/2012
//  @ Author : fabian vargas
// esta clase me permite suministra la informacion de el cliente datos correspondientes de persona 
//




	public class Cliente {
		//declaro los atributos
	private String nombre;
	private String direccion;
	private float credito;
	public String telefono;
	public int codigocliente;
	public Pedido Pedidos123;
	
	
	public Cliente(String nombre, String direccion, float credito,
			String telefono, int codigocliente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.credito = credito;
		this.telefono = telefono;
		this.codigocliente = codigocliente;
	}


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setNombre(String nombre) {
            this.nombre=nombre;
	
	}
	
	
	public String getNombre() {
		return nombre;
	
	}
	
	public void setCreditoHabilitado(float credito) {
	this.credito=credito;
	}
	
	public float getCreditoHabilitado() {
		return credito;
	
	}
	
	public void setTelefono(String telefono) {
	this.telefono=telefono;
	}
	
	public String getTelefono() {
		return telefono;
	
	}
	
	public void setCodigo(int codigo) {
		this.codigocliente=codigo;
	
	}
	
	public int getCodigo() {
		return codigocliente;
	
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion
				+ ", credito=" + credito + ", telefono=" + telefono
				+ ", codigocliente=" + codigocliente + "]";
	}
}
