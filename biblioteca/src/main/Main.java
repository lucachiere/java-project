package main;
import model.Biblioteca;

class Main {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();
		
		b.addLibro("nome libro", "nome autore", 2001, true);
		
		b.viewLibrary();

	}

	static void print(String testo) {
		System.out.println(testo);
	}
	
}
