package biblioteca.model;

public abstract class ItemBiblioteca {
	// Atributos
	protected int id;
	protected String titulo;
	protected String anioPublicacion;
	
	
	// Métodos
	public abstract String obtenerDescripcion();
	
	@Override
	public abstract String toString();
	
	

}
