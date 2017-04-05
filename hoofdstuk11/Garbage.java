class Garbage {

	public static String getString(int x, int y) {
		return "Object[" + x + "][" + y + "]";
	}

	public static void main(String args[]) {
		System.out.println("Improved performance of obsolete code.");
		
		for (int i = 0; i <= 100000; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println(getString(i, j));

			}
		}
	}
}
