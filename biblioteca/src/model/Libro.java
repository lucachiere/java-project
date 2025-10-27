package model;

class Libro {
	String titolo, autore;
	int anno;
	boolean disponibile;
	
	Libro(String titolo, String autore, int anno, boolean disponibile){
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.disponibile = disponibile;
	}
	
	void info() {
		System.out.println("titolo: " + titolo + "\nautore: " + autore + "\nanno: " + anno + "\ndisponibile: " + disponibile);
	}
	
}
