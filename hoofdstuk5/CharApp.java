class CharApp {
	public static void main(String args[]) {

      System.out.printf("    ");
  	  
  	  for(int j = 0; j<=9; j++) {
        System.out.printf(j + " ");	
      }
		
	  System.out.println();	
	  
      for(int i = 30; i<=129; i+=10) {
        
        if(i<100) System.out.printf(" ");
        System.out.printf("%s ", i);
      
        for(int j = 0; j<=9; j++) {
	      System.out.printf("%s ", (char)(j+i));	
	    }
	    
	    System.out.println();
	  }
    }
}
