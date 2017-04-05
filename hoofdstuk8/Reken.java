class Reken {

	public static void main(String args[]) {
		float invoer = 4.5678f;
		System.out.println(rondAf(invoer, (short) 3));

		float invoer2 = 3.1414926f;
		System.out.println(rondAf(invoer2, (short) 2));
	}

	static float rondAf(float invoer, short decimalen) {
		double resultaat = invoer * Math.pow(10, decimalen);
		resultaat = Math.round(resultaat);
		resultaat /= Math.pow(10, decimalen);
		return (float) resultaat;
	}
}
