abstract class Figuur {
	abstract double omtrek();
}

class Rectangle extends Figuur {
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
// class Square extends Rectangle {
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

		Rectangle rechthoek = new Rectangle();
		rechthoek.breedte = 5;
		rechthoek.hoogte = 6;

		System.out.println(rechthoek.toString());
	}

}
