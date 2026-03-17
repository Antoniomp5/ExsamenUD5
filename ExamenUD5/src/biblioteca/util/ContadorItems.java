package biblioteca.util;
import biblioteca.model.ItemBiblioteca;

public class ContadorItems {
	// Atributo
	public static int contador;
	public ItemBiblioteca item;
	
	public ContadorItems(ItemBiblioteca item) {
		this.item = item;
	}
	
	// Métodos
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ContadorItems.contador = contador;
	}

	public ItemBiblioteca getItem() {
		return item;
	}

	public void setItem(ItemBiblioteca item) {
		this.item = item;
	}

	
	public static int getTotalItems() {
		++contador;
		return contador;
		
	}

}
