package auto;

public class Auto {

	String marca, modello;
	int cavalli, anno;

	Auto(String marca, String modello, int cavalli, int anno) {
		this.marca = marca;
		this.modello = modello;
		this.cavalli = cavalli;
		this.anno = anno;
	}

	void caratt() {
		System.out.println("marca: " + marca + "\nmodello: " + modello + "\ncavalli: " + cavalli + "\nanno: " + anno);
	}

}
