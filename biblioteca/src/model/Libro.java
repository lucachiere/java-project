package model;

class Libro {
	private String titolo, autore;
	private int anno;
	private boolean disponibile;
	
	public Libro(String titolo, String autore, int anno, boolean disponibile){
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.disponibile = disponibile;
	}
	
	public void info() {
		System.out.println("titolo: " + titolo + "\nautore: " + autore + "\nanno: " + anno + "\ndisponibile: " + disponibile);
	}

	public String getTitle() {
		return titolo;
	}
}
