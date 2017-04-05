import java.math.BigInteger;

class KorrelsApp2 {

	public static void main(String args[]) {
		System.out.println("Will use the class BigInteger.");
		
		BigInteger[][] schaakbord = new BigInteger[8][8];

		BigInteger current = BigInteger.valueOf(1);
		
		for(int i = 0; i < schaakbord.length; i++) {
			BigInteger rijSum = BigInteger.valueOf(0);
			
			for(int j = 0; j < schaakbord[i].length; j++) {
				rijSum = rijSum.add(current);

				schaakbord[i][j] = current;
				
				current = current.multiply(BigInteger.valueOf(2));
			}

			System.out.printf("Sum of row %s is: %s\n", i, rijSum);

		}

	}
}
