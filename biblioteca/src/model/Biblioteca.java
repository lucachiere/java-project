package model;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Libro> libroList = new ArrayList<>();
	
	public void addLibro(String titolo, String autore, int anno, boolean disponibile) {
		libroList.add(new Libro(titolo, autore, anno, disponibile));
	}
	
	public void viewLibrary() {
		libroList.forEach(element->{
			element.info();
		});
	}
}
