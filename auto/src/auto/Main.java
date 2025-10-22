package auto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		try {
			BufferedWriter fileWrt = new BufferedWriter(new FileWriter("auto.txt", true));
			BufferedReader fileRdr = new BufferedReader(new FileReader("auto.txt"));
			Scanner userInput = new Scanner(System.in);
			ArrayList<Auto> autoList = new ArrayList<>();

			print("menù");
			print("1- inserisci auto");
			print("2- visualizza auto");

			int selezione = Integer.parseInt(userInput.nextLine());
			if (selezione == 1) {
				boolean continua = true;
				do {
					print("inserisci auto");
					print("marca: ");
					String marca = userInput.nextLine();
					print("modello: ");
					String modello = userInput.nextLine();
					print("cavalli: ");
					int cavalli = Integer.parseInt(userInput.nextLine());
					print("anno: ");
					int anno = Integer.parseInt(userInput.nextLine());

					autoList.add(new Auto(marca, modello, cavalli, anno));

					fileWrt.write("marca: " + marca);
					fileWrt.newLine();
					fileWrt.write("modello: " + modello);
					fileWrt.newLine();
					fileWrt.write("cavalli: " + cavalli);
					fileWrt.newLine();
					fileWrt.write("anno: " + anno);
					fileWrt.newLine();
					fileWrt.write("----------------");
					fileWrt.newLine();

					print("vuoi continuare? y/n");
					continua = userInput.nextLine().equals("y") ? true : false;

				} while (continua);

				for (Auto a : autoList) {
					a.caratt();
					print("----------------");
				}
				fileWrt.close();
				userInput.close();
			}else if(selezione == 2) {
				fileRdr.lines().forEach(element -> {
					print(element);
				});
			}

		} catch (IOException e) {
			print("errore nella creazione del file.");
		}

	}

	static void print(String x) {
		System.out.println(x);
	}

}
