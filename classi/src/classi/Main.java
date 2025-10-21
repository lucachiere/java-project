package classi;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		ArrayList<Studente> studentArr = new ArrayList<>();

		boolean continua = true;

		do {
			print("inserisci nome, cognome, età, voto");

			String nome = userInput.nextLine();
			String cognome = userInput.nextLine();
			int eta = Integer.parseInt(userInput.nextLine());
			double voto = Double.parseDouble(userInput.nextLine());
			studentArr.add(new Studente(nome, cognome, eta, voto));

			print("vuoi continuare? y/n");

			continua = userInput.nextLine().equals("y") ? true : false;

		} while (continua);

		for (Studente s : studentArr) {
			s.saluta();
			s.votoMed();
			print("---------------");
		}

		userInput.close();
	}

	static void print(String x) {
		System.out.println(x);
	}

}
