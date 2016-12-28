package Test;

import Default.ProductoresImpl;
import Default.ProveedoresImpl;
import Enumeradores.Productores.Productos;
import Enumeradores.Proveedores;
import Enumeradores.Proveedores.Materia;

public class VelasTesting 
{

	public static void main(String[] args) 
	{
		Proveedores MateriaProv1=new ProveedoresImpl();
		MateriaProv1.setMateria(Materia.Aromas);
		ProveedoresImpl Provee1=new ProveedoresImpl();
		Provee1.setNameProveedor("Industria de Aromas");
		
		Proveedores MateriaProv2=new ProveedoresImpl();
		MateriaProv2.setMateria(Materia.Parafina);
		ProveedoresImpl Provee2=new ProveedoresImpl();
		Provee2.setNameProveedor("Industria de Parafina");
		
		Proveedores MateriaProv3=new ProveedoresImpl();
		MateriaProv3.setMateria(Materia.Colorantes);
		ProveedoresImpl Provee3=new ProveedoresImpl();
		Provee3.setNameProveedor("Industria de Colorantes");
		
		Proveedores MateriaProv4=new ProveedoresImpl();
		MateriaProv4.setMateria(Materia.Desmoldeador);
		ProveedoresImpl Provee4=new ProveedoresImpl();
		Provee4.setNameProveedor("Industria de Desmoldeador");
		
		ProductoresImpl Productor1=new ProductoresImpl();
		Productor1.setNombreProductora("Uno");
		Productor1.setProducto(Productos.VelasConFiguras);
		System.out.println("Productora: "+Productor1.getNombreProductora());
		Productor1.CrearProducto();
		
		ProductoresImpl Productor2=new ProductoresImpl();
		Productor2.setNombreProductora("Dos");
		Productor2.setProducto(Productos.Velones);
		System.out.println("Productora: "+Productor2.getNombreProductora());
		Productor2.CrearProducto();
		
		ProductoresImpl Productor3=new ProductoresImpl();
		Productor3.setNombreProductora("Tres");
		Productor3.setProducto(Productos.VelasFlotantes);
		System.out.println("Productora: "+Productor3.getNombreProductora());
		Productor3.CrearProducto();
		
		ProductoresImpl Productor4=new ProductoresImpl();
		Productor4.setNombreProductora("Cuatro");
		Productor4.setProducto(Productos.VelasDeParafina);
		System.out.println("Productora: "+Productor4.getNombreProductora());
		Productor4.CrearProducto();
		
		ProductoresImpl Productor5=new ProductoresImpl();
		Productor5.setNombreProductora("Cinco");
		Productor5.setProducto(Productos.VelasDeGel);
		System.out.println("Productora: "+Productor5.getNombreProductora());
		Productor5.CrearProducto();
		
		ProductoresImpl Productor6=new ProductoresImpl();
		Productor6.setNombreProductora("Seis");
		Productor6.setProducto(Productos.VelasconIncrustaciones);
		System.out.println("Productora: "+Productor6.getNombreProductora());
		Productor6.CrearProducto();
		
		ProductoresImpl Productor7=new ProductoresImpl();
		Productor7.setNombreProductora("Siete");
		Productor7.setProducto(Productos.VelasConDiseño);
		System.out.println("Productora: "+Productor7.getNombreProductora());
		Productor7.CrearProducto();
		
		ProductoresImpl Productor8=new ProductoresImpl();
		Productor8.setNombreProductora("Ocho");
		Productor8.setProducto(Productos.VelasDeMiel);
		System.out.println("Productora: "+Productor8.getNombreProductora());
		Productor8.CrearProducto();

		System.out.println("\n"+Provee1.VerificarProveedor()+MateriaProv1.VerificarMateria()+"\n"
						   +Provee2.VerificarProveedor()+MateriaProv2.VerificarMateria()+"\n"
						   +Provee3.VerificarProveedor()+MateriaProv3.VerificarMateria()+"\n"
						   +Provee4.VerificarProveedor()+MateriaProv4.VerificarMateria()+"\n"
						   );
		
		
		
	}

}
