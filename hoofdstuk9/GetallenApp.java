import java.util.Arrays;

class GetallenApp {

	public static void main(String args[]) {
		try {

			int[] values = new int[args.length];

			for (int i = 0; i < args.length; i++)
				values[i] = Integer.parseInt(args[i]);

			Arrays.sort(values);

			for (int value : values) {
				System.out.println(value);
			}
		} catch (NumberFormatException e) {
			System.out.printf("Please pass some numbers.\nInput was: %s.\nTry again.", Arrays.toString(args));
		}
	}

}
