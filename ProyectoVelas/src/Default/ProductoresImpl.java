package Default;

import Enumeradores.Productores;

public class ProductoresImpl implements Productores 
{
	private Productos producto;
	private String NombreProductora;

	public void setProducto(Productos producto) 
	{
		this.producto=producto;
	}

	public Productos getProducto() 
	{
		return producto;
	}

	public void mostrarProducto() 
	{
		
	}

	public String getNombreProductora() 
	{
		return NombreProductora;
	}

	public void setNombreProductora(String nombreProductora) 
	{
		NombreProductora = nombreProductora;
	}
	
	public void CrearProducto()
	{
		if(getProducto()==producto)
		{
			System.out.println("Producto creado:"+getProducto());
		}
		else
		{
			System.out.println("No se puede crear el producto");
		}
	}
	

}
