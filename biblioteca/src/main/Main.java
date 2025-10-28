package main;

import java.util.Scanner;

import model.Biblioteca;

class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Biblioteca b = new Biblioteca();

		boolean running = true;

		while (running == true) {
			print("\nselezione cosa fare: " + "\n1) Aggiungi un libro " + "\n2) Visualizza intera biblioteca "
					+ "\n3) Ricerca libro " + "\n4) Esci");

			int userSel = Integer.parseInt(userInput.nextLine());
			if (userSel == 1) {
				print("titolo: ");
				String bookTitle = userInput.nextLine();
				print("autore: ");
				String autore = userInput.nextLine();
				print("anno: ");
				int anno = userInput.nextInt();
				print("disponibile? (true/false)");
				boolean avaible = userInput.nextBoolean();
				userInput.nextLine();
				b.addBook(bookTitle, autore, anno, avaible);
			} else if (userSel == 2) {
				b.viewLibrary();
			} else if (userSel == 3) {
				print("titolo libro?");
				String bookTitle = userInput.nextLine();
				b.searchBook(bookTitle);
			} else if (userSel == 4) {
				userInput.close();
				running = false;
			} else {
				print("selezione non valida!!");
			}
		}

	}

	static void print(String testo) {
		System.out.println(testo);
	}

}
