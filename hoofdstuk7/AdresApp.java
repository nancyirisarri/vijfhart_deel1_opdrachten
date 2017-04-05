class Adres {
	private String straatnaam;
	private int huisnummer;
	private String postcode;
	private String plaats;

	Adres() {
	}

	Adres(String straatnaam, int huisnummer, String postcode, String plaats) {
		this.straatnaam = straatnaam;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
	}

	Adres(String straatnaam, int huisnummer, String plaats) {
		// this.straatnaam = straatnaam;
		// this.huisnummer = huisnummer;
		// this.plaats = plaats;
		this(straatnaam, huisnummer, null, plaats);
	}

	Adres(String postcode, int huisnummer) {
		// this.huisnummer = huisnummer;
		// this.postcode = postcode;
		this(null, huisnummer, postcode, null);
	}

	public void setStraat(String straatnaam) {
		this.straatnaam = straatnaam;
	}

	public void setNummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String toString() {
		String result = this.straatnaam + " " + this.huisnummer + "\n" + this.postcode + " " + this.plaats;
		return result;
	}
}

class AdresApp {
	public static void main(String args[]) {
		Adres adres = new Adres("Hendrikstraat", 2, "9102AK", "Groningen");
		System.out.println(adres.toString());

		System.out.println("#####################");

		Adres adres2 = new Adres("9102AK", 45);
		System.out.println(adres2.toString());

		System.out.println("#####################");

		adres2.setStraat("Hendrikstraat");
		adres2.setPlaats("Groningen");
		System.out.println(adres2.toString());
	}
}
