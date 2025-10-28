package model;

public class Dvd implements Stampabile{

	private String titolo;
	private int anno;
	private float prezzo;
	
	public Dvd(String titolo, int anno, float prezzo) {
		this.titolo = titolo;
		this.anno = anno;
		this.prezzo = prezzo;
	}
	
	@Override
	public void stampa() {
		System.out.println("DVD: \nTitolo " + titolo + "\nAnno " + anno + "\nPrezzo " + prezzo);
	}
	
}
