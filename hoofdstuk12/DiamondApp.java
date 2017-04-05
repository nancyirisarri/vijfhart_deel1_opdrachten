import java.util.*;

class DiamondApp {

	public static void main(String args[]) {
		List<Integer> listInt = new ArrayList<>();
		List<String> listString = new ArrayList<>();

		Collections.addAll(listInt, 1, 2, 3, 4, 5);
		Collections.addAll(listString, "one", "two", "three", "four", "five");

		toon(listInt);
		toon(listString);

	}

	static void toon(List<? extends Object> list) {
		for (Object e : list) {
			System.out.println(e);
		}
	}

}
