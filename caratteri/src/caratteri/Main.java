package caratteri;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		char[] vocali = { 'a', 'e', 'i', 'o', 'u' };

		System.out.println("inserire parola: ");
		String parola = userInput.nextLine();


		int contVoc = 0;
		for (int i = 0; i < parola.length(); i++) {
			System.out.println(parola.charAt(i));
			for (int j = 0; j < vocali.length; j++) {
				if (vocali[j] == parola.charAt(i))
					contVoc++;
			}
		}

		if (contVoc > 0)
			System.out.println("ha " + contVoc + " vocali!!");
		else
			System.out.println("non ha vocali!!");

		userInput.close();

	}

}
