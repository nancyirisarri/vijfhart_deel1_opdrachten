class KorrelsApp {

	public static void main(String args[]) {
		double[][] schaakbord = new double[8][8];

		double current = 1;

		for(int i = 0; i < schaakbord.length; i++) {
			double rijSum = 0;
			
			for(int j = 0; j < schaakbord[i].length; j++) {
				rijSum += current;
				schaakbord[i][j] = current;
				current *= 2;
				//System.out.printf(schaakbord[i][j] + "");
				//System.out.printf(" ");
			}

			System.out.printf("Sum of row %s is: %s\n", i, rijSum);

		}
	}
}
