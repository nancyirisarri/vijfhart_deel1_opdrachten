class KeerOm {

	public static void main(String args[]) {

		if (args.length != 1) {
			System.out.println("Please pass (at least) one word. Only one word will be reversed. Try again");

		} else {
			System.out.printf("Will reverse the letters of the string: %s.\n", args[0]);

			StringBuilder result = new StringBuilder(args[0]);

			System.out.printf("The result is: %s.\n", result.reverse());

		}
	}
}
