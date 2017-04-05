import java.util.Arrays;
import java.util.List;

class SubstringApp {

	public static void main(String args[]) {
		String errorMessage = String.format("Please pass one word and two whole numbers that indicate the letters that you want to keep.\nInput was: %s.\nTry again.", Arrays.toString(args));
				
		if (args.length != 3) {			
			System.out.printf(errorMessage);
			
		} else {
			try {
				int num1 = Integer.parseInt(args[1]) - 1;
				int num2 = Integer.parseInt(args[2]) + 1;

				String result = args[0].substring(num1, num2);

				System.out.println(String.format("The substring is: %s.", result));

			} catch (NumberFormatException e) {
				System.out.printf(errorMessage);
			}

		}
	}

}
