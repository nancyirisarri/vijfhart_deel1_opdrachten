class TelDagen {

  public static void main(String args[]) {
	
	int totaal = 0;
	
	for(String i : args) {
		totaal += getDays(i);
	}
	
	System.out.println("Totaal aantal dagen: " + totaal);
	
  }
  
  static int getDays(String maand) {
	
	switch(maand.toUpperCase()) {
		case "JANUARI": return 31;
		case "FEBRUARI": return 28;
		case "MAART": return 31;
		case "APRIL": return 30;
		case "MEI": return 31;
		case "JUNI": return 30;
		case "JULI": return 31;
		case "AUGUSTUS": return 31;
		case "SEPTEMBER": return 30;
		case "OKTOBER": return 31;
		case "NOVEMBER": return 30; 
		case "DECEMBER": return 31;
		default: 
			System.out.printf("Did not find this month. Counting 0 days for: %s.\n", maand);
			return 0;
	}  
  }
  
}
