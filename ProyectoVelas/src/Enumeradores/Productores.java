package Enumeradores;

public interface Productores 
{
	enum Productos 
	{
		VelasConFiguras,
		Velones,
		VelasFlotantes,
		VelasDeParafina,
		VelasDeGel,
		VelasconIncrustaciones,
		VelasConDiseņo,
		VelasDeMiel
	}
	
	public void setProducto(Productos producto);

	public Productos getProducto();

	public void mostrarProducto();
}
