package Enumeradores;

public interface Proveedores 
{
	enum Materia 
	{
		Parafina, 
		Colorantes, 
		Desmoldeador, 
		Aromas
	}
	public void setMateria(Materia materia);

	public Materia getMateria();

	public String VerificarMateria();


}
