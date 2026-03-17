package biblioteca.model;

public class Revista extends ItemBiblioteca{
	// Atributos
	private int numero;
	private String periodicidad;
	
	// Constructor
	Revista(int numero, String periodicidad) {
		this.numero = numero;
		this.periodicidad = periodicidad;
	}
	
	// Métodos
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}


	@Override
	public String obtenerDescripcion() {
		return "Autor" + numero +
				"Número de páginas" + periodicidad;
	}
	@Override
	public String toString() {
		return null;
	}
	

}
