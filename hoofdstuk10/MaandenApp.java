import java.util.EnumSet;

class MaandenApp {
  enum Maanden {
	JANUARI(31), FEBRUARI(28), MAART(31), APRIL(30), MEI(31), JUNI(30), 
	JULI(31), AUGUSTUS(31), SEPTEMBER(30), OKTOBER(31), NOVEMBER(30), 
	DECEMBER(31);
	
	private final int dagen;
	
	Maanden(int dagen) {
	  this.dagen = dagen;	
	}	  
  }
  
  enum Kwartalen {
	LENTE(EnumSet.range(Maanden.MAART, Maanden.MEI)),
	ZOMER(EnumSet.range(Maanden.JUNI, Maanden.AUGUSTUS)),
	HERFST(EnumSet.range(Maanden.SEPTEMBER, Maanden.NOVEMBER));
	//WINTER(EnumSet.range(Maanden.DECEMBER, Maanden.FEBRUARI));
	
	private final EnumSet maanden;
	
	Kwartalen(EnumSet<Maanden> maanden) {
	  this.maanden = maanden;
	}

  }
  
  public static void main(String args[]) {
	  
	  int totaal = 0;
	  
	  for(Maanden m : Maanden.values()){
		totaal += m.dagen;
	  }
	  
	  System.out.println("totaal dagen in jaar " + totaal);
	  
	  for(Kwartalen kwartaal : Kwartalen.values()) {
		int totaalKwartaal = 0;

		for(Object obj : kwartaal.maanden) {
		  totaalKwartaal += ((Maanden)obj).dagen;	
		} 
		System.out.println(kwartaal + " " + totaalKwartaal);
	  }
	  
  }
	
}
