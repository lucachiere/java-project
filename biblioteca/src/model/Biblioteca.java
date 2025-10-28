package model;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Libro> libroList = new ArrayList<>();
	
	public void addBook(String titolo, String autore, int anno, boolean disponibile) {
		libroList.add(new Libro(titolo, autore, anno, disponibile));
	}
	
	public void viewLibrary() {
		libroList.forEach(element->{
			element.info();
			System.out.println("-----------------------------");
		});
	}
	
	public void searchBook(String titolo) {
		boolean trovato = false;
		for(Libro element : libroList)
			if(element.getTitle().equalsIgnoreCase(titolo)) {
				trovato = true;
				element.info();
				System.out.println("-----------------------------");
			}
		
		if(trovato == false)
			System.out.println("libro non trovato!!");
		
	}
}
