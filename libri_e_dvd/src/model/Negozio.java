package model;

import java.util.ArrayList;

public class Negozio {

	String titolo, autore;
	int anno;
	float prezzo;

	ArrayList<Libri> libriList = new ArrayList<>();
	ArrayList<Dvd> dvdList = new ArrayList<>();

	public void addBook(String titolo, String autore, float prezzo) {
		libriList.add(new Libri(titolo, autore, prezzo));
	}

	public void addDvd(String titolo, int anno, float prezzo) {
		dvdList.add(new Dvd(titolo, anno, prezzo));
	}

	public void viewAll() {
		for (Libri l : libriList) {
			l.stampa();
			System.out.println("---------------------------------");
		}
		for (Dvd d : dvdList) {
			d.stampa();
			System.out.println("---------------------------------");
		}
	}

}
