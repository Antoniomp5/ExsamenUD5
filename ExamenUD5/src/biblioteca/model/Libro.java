package biblioteca.model;
import java.util.List;
import java.util.ArrayList;

public class Libro extends ItemBiblioteca{
	// Atributos
	private Autor autor;
	private int numeroPaginas;
	
	List<Autor> a = new ArrayList();
	
	// Constructor
	Libro(Autor autor, int numeroPaginas) {
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	// Métodos
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	@Override
	public String obtenerDescripcion() {
		return "Autor" + autor +
				"Número de páginas" + numeroPaginas;
	}
	@Override
	public String toString() {
		return null;
	}
	
}
