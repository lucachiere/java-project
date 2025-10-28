package model;

public class Libri implements Stampabile {

	private String titolo, autore;
	private float prezzo;

	public Libri(String titolo, String autore, float prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	
	@Override
	public void stampa() {
		System.out.println("Libro: \nTitolo " + titolo + "\nAutore " + autore + "\nPrezzo " + prezzo);
	}
	

}
