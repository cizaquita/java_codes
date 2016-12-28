package Default;

import Enumeradores.Proveedores;


public class ProveedoresImpl implements Proveedores
{	
	private Materia materia;
	private String NameProveedor, NameProveedorAlternativo;
	
	public ProveedoresImpl()
	{
		
	}
	public String getNameProveedor() 
	{
		return NameProveedor;
	}

	public void setNameProveedor(String nameProveedor) 
	{
		NameProveedor = nameProveedor;
	}

	public String getNameProveedorAlternativo() 
	{
		return NameProveedorAlternativo;
	}

	public void setNameProveedorAlternativo(String nameProveedorAlternativo) 
	{
		NameProveedorAlternativo = nameProveedorAlternativo;
	}
	public Materia getMateria() 
	{
		return materia;
	}
	public void setMateria(Materia materia) 
	{
		this.materia = materia;
	}
	public String VerificarMateria() 
	{
		return "'\nMateria prima: "+materia;
	}
	
	public String VerificarProveedor()
	{
		return "Proveedor: "+getNameProveedor();		
	}
	
	
}
