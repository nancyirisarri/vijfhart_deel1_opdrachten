class CharSeqApp {

	static CharSequence eersteLaatst(CharSequence charSeq) {
		StringBuilder resultaat = new StringBuilder();
		resultaat.append(charSeq.subSequence(1, charSeq.length()));
		resultaat.append(charSeq.charAt(0));
		
		return resultaat;

		// Implementation by teacher:
		//CharSequence x = a.subSequence(1, a.length());
		//StringBuilder sb = new StringBuilder(x);
		//sb = sb.insert(x.length(), a.charAt(0));
		//return sb;
	}
	
	public static void main(String args[]) {
		System.out.println(eersteLaatst("tram"));
		System.out.println(eersteLaatst("book"));
		System.out.println(eersteLaatst("laptop"));
		System.out.println(eersteLaatst("cursus"));
	}
}
