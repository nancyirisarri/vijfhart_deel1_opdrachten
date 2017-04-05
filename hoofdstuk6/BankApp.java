class BankRekening {
  final private int rekeningnummer = 76892345;
  private double saldo = 0D;
  
  public int getRekeningnummer() {
	return rekeningnummer;  
  }
  
  public double getSaldo() {
	return saldo;  
  }
  
  public void stort(double bedrag) {
	  if(saldo + bedrag < 0D) {
		  System.out.println("Kan niet, saldo wordt negatief.");
		  return;
	  }
	  saldo += bedrag;
	  return;
  }
}

class BankApp {
  public static void main(String args[]) {
	  BankRekening rekening = new BankRekening();

	  rekening.stort(150D);	
	  rekening.stort(-80D);	
	  rekening.stort(-100D);	
	  
	  System.out.println(rekening.getRekeningnummer());
	  System.out.println(rekening.getSaldo());
  }
}
