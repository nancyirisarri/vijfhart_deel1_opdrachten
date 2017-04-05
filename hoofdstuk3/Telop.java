import java.util.Arrays;

class Telop {

	public static void main(String args[]) {
		String errorMessage = String.format("Please pass two numbers that will be added.\nInput was: %s.\nTry again.",
				Arrays.toString(args));

		if (args.length != 2) {
			System.out.printf(errorMessage);

		} else {
			try {
				System.out.printf("%s + %s = %s", args[0], args[1],
						(Double.parseDouble(args[0]) + Double.parseDouble(args[1])));
			} catch (NumberFormatException e) {
				System.out.printf(errorMessage);
			}

		}
	}
}
