package Main;

import java.util.Scanner;

import model.Negozio;

public class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Negozio n = new Negozio();
		
		boolean continua = true;

		while (continua) {
			print("Seleziona:");
			print("1) Aggiungi libro:");
			print("2) Aggiungi dvd:");
			print("3) Visualizza tutto:");
			print("4) Esci");

			String selezione = userInput.nextLine();

			if (selezione.equals("1")) {
				print("titolo");
				String titolo = userInput.nextLine();
				print("autore");
				String autore = userInput.nextLine();
				print("prezzo");
				float prezzo = userInput.nextFloat();
				n.addBook(titolo, autore, prezzo);
				userInput.nextLine();
			} else if (selezione.equals("2")) {
				print("titolo");
				String titolo = userInput.nextLine();
				print("anno");
				int anno = userInput.nextInt();
				print("prezzo");
				float prezzo = userInput.nextFloat();
				n.addDvd(titolo, anno, prezzo);
				userInput.nextLine();
			} else if (selezione.equals("3")) {
				n.viewAll();
			} else if (selezione.equals("4")) {
				continua = false;
			} else {
				print("selezione errata!!!");
			}
		}
		
		userInput.close();

	}

	static void print(String testo) {
		System.out.println(testo);
	}

}
