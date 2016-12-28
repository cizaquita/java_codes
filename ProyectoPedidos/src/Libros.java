

public class Libros {
	private String titulo;
	private int  codigo; 
	private String editorial;
	private float precio;
	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libros(String titulo, int codigo, String editorial, float precio) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.editorial = editorial;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getEditorial() {
		return editorial;
	}
	public float getPrecio() {
		return precio;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "[titulo= " + titulo + ", codigo= " + codigo
				+ ", editorial= " + editorial + ", precio= " + precio +  "]";
	}

}
