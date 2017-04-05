class Lijn {
	Punt a;
	Punt b;

	public Lijn() {
	};

	public Lijn(int x1, int y1, int x2, int y2) {
		this.a = new Punt();
		this.a.x = x1;
		this.a.y = y1;

		this.b = new Punt();
		this.b.x = x2;
		this.b.y = y2;
	}

	float lengte() {
		return this.a.afstand(this.b);
	}

	private class Punt {
		int x;
		int y;

		float afstand(Punt p) {
			return (float) Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
		}
	}

}

class LijnApp {

	public static void main(String args[]) {
		Lijn lijn = new Lijn(4, 5, 1, 2);
		System.out.println("Should be 4.24264");
		System.out.println(lijn.lengte());

		System.out.println("#####################");

		Lijn lijn2 = new Lijn(4456, 5782, 1435, 2123);
		System.out.println("Should be 4744.96807");
		System.out.println(lijn2.lengte());
	}
}
