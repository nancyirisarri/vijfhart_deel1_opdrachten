import java.util.*;

class BestellingApp {

	public static void main(String args[]) {

		Map<String, Float> prijzen = new HashMap<String, Float>();
		prijzen.put("stuiterbal", new Float(1.5));
		prijzen.put("bromtol", new Float(3.0));
		prijzen.put("pop", new Float(2.0));
		prijzen.put("puzzel", new Float(2.5));

		float resultaat = 0;

		for (int i = 0; i < (args.length - 1); i += 2) {
			System.out.printf("Adding the price of %s %s.\n", args[i+1], args[i]);
			resultaat += calcPrijs(prijzen.get(args[i]), Integer.parseInt(args[i + 1]));
		}
		System.out.printf("Order price is: %s", resultaat);
	}

	static float calcPrijs(Float prijs, int nummer) {
		return prijs * nummer;
	}

}
