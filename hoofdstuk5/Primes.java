class Primes {

  public static void main(String args[]) {
    	
	System.out.println("must give false");
	System.out.println(isPriem(4));
	System.out.println(isPriem(8));
	System.out.println(isPriem(10));
	System.out.println(isPriem(50));
	System.out.println(isPriem(100));
	System.out.println(isPriem(25));
	System.out.println(isPriem(81));

	System.out.println("must give true");
	System.out.println(isPriem(1));
	System.out.println(isPriem(2));
	System.out.println(isPriem(3));
	System.out.println(isPriem(5));
	System.out.println(isPriem(7));
	System.out.println(isPriem(11));
	System.out.println(isPriem(13));
	System.out.println(isPriem(17));
	System.out.println(isPriem(19));
	System.out.println(isPriem(23));
  }

  static boolean isPriem(int getal) {
	
	boolean result = true;
	
	if(getal % 2 == 0) {
	    
	  if(getal > 2) {
	   result = false;	
	  }
  
    } else {
	
	  for(int i = 3; i <= Math.sqrt(getal); i+=2) {
    	if(getal % i == 0) {
			result = false;
		}
	  }	
	}
	
    return result;
  }

}
