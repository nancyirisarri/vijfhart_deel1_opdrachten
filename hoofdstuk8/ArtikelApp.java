class Artikel {
	String naam;
	float prijs;

	public String getNaam() {
		return naam;
	}

	public float getPrijs() {
		return prijs;
	}

	public boolean equals(Object artikel) {

		if (artikel != null && artikel instanceof Artikel) {

			Artikel art = (Artikel) artikel;
			if (art.getNaam().equals(naam) && prijs == art.getPrijs()) {
				return true;
			}

		}

		return false;
	}

}

class ArtikelApp {

	public static void main(String args[]) {

		Artikel artikel1 = new Artikel();
		artikel1.naam = "jurk";
		artikel1.prijs = 19.99f;

		Artikel artikel2 = new Artikel();
		artikel2.naam = "blouse";
		artikel2.prijs = 19.99f;

		System.out.println(artikel2.equals(artikel1));

	}

}
