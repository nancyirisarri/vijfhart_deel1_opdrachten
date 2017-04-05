class RekeningApp {

	public static void main(String args[]) {
		System.out.printf("Check if %s is a valid bank account number.\n", args[0]);
		
		int sum = 0;
		
		for (int i = 0; i < args[0].length(); i++) {

			for (int j = 9; j == 1; j--) {
				sum += j * Integer.parseInt(args[0].substring(i, i + 1));
			}
		}

		if (sum % 11 == 0) {
			System.out.println("Good number.");
		} else {
			System.out.println("Bad number.");
		}

	}

}
