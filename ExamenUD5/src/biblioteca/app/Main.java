package biblioteca.app;

import biblioteca.model.Autor;
import biblioteca.model.Libro;
import biblioteca.model.Revista;

public class Main {

	public static void main(String[] args) {
		
		//int item = 0;
		
		Autor a1 = new Autor ("IlloJuan", "español");
		Autor a2 = new Autor ("Rubius", "noruego");
		Autor a3 = new Autor ("Grefg", "andorrano");
		
		Libro l1 = new Libro(a1, 78);
		Libro l2 = new Libro(a2, 178);
		Libro l3 = new Libro(a3, 878);
		
		l1.obtenerDescripcion();
		l2.obtenerDescripcion();
		l3.obtenerDescripcion();
		
		Revista r1 = new Revista(34, "Semanal");
		Revista r2 = new Revista(12, "Anual");
		Revista r3 = new Revista(1000, "Diaría");
		
		r1.obtenerDescripcion();
		r2.obtenerDescripcion();
		r3.obtenerDescripcion();
		
		//item.getTotalItems();

	}

}

