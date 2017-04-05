import java.util.Arrays;

class Faculteit {

	public static void main(String args[]) {
		String errorMessage = String.format("Please pass a number to calculate its factorial.\nInput was: %s.\nTry again.", Arrays.toString(args));

		if (args.length != 1) {
			System.out.printf(errorMessage);

		} else {
			try {
				int input = 1;

				int result = 1;

				while (input <= Integer.parseInt(args[0])) {
					result *= input;
					input++;
				}

				System.out.println(result);
			} catch (NumberFormatException e) {
				System.out.printf(errorMessage);
			}

		}
	}
}
