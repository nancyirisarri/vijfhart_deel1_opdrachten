import java.util.Arrays;

class VraagApp {

	public static void main(String args[]) {
		String errorMessage = String.format(
				"Please pass some words and numbers to make a question.\nInput was: %s.\nTry again.",
				Arrays.toString(args));

		if (args.length == 0) {
			System.out.printf(errorMessage);
		} else {
			StringBuilder result = new StringBuilder();

			result.append(args[1]).append(" ").append(args[0]).append(" ");

			for (int i = 2; i < args.length; i++) {
				result.append(args[i]);

				if (i < args.length - 1) {
					result.append(" ");
				}
			}

			System.out.println(result.append("?"));
		}
	}
}
