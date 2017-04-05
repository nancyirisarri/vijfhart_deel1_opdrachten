abstract class Figuur {
	abstract double omtrek();
}

class Rechthoek extends Figuur {
	double breedte, hoogte;

	double omtrek() {
		return 2 * (hoogte + breedte);
	};

	public String toString() {
		return "Rechthoek met breedte " + breedte + " hoogte " + hoogte;
	}
}

class Square extends Figuur {
// of
// class Square extends Rechthoek {
// en lege body
	double breedte, hoogte;

	double omtrek() {
		return 2 * (hoogte + breedte);
	};
}

class Circle extends Figuur {
	double straal;

	double omtrek() {
		return 2 * Math.PI * straal;
	};
}

class App {

	public static void main(String args[]) {
		System.out.println("hello");

		Rechthoek rechthoek = new Rechthoek();
		rechthoek.breedte = 5;
		rechthoek.hoogte = 6;

		System.out.println(rechthoek.toString());
	}

}
