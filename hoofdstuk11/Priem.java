public class Priem
{
  public static void main (String args[]) throws Exception
  {

	int start = 0, einde = 0;

	try {

	  if(args.length != 2) {
	    throw new NummerFout("Please give two parameters.");	
	  }

	  try {
		start = Integer.parseInt(args[0]);
		einde = Integer.parseInt(args[1]);

	  } catch(NumberFormatException nfe) {

	    try {
		 
		   Double.parseDouble(args[0]);
           Double.parseDouble(args[1]); 
           
           throw new NummerFout("Please give whole numbers.", nfe);
         
	    } catch (NumberFormatException nfe2) {
		  
  		  throw new NummerFout("Please give numbers.", nfe2);
	    }
	  
	  }

	  if(start < 0 || einde < 0) {
		throw new NummerFout("Please give positive numbers.");
	  }

	  if(start > einde) {
		throw new NummerFout("Please give second number that is larger than first.");
	  }
    	  	
	} catch (NummerFout nf) {
	  nf.printStackTrace();	
	}
	
	System.out.printf("The prime numbers between %s and %s are:\n", start, einde);
	for(int i=start;i<=einde && i>0;i++) {
        if (isPriem(i))
          System.out.println(i);
    }
  }
  
  static boolean isPriem(int getal)
  {
    if(getal>2 && getal%2==0)
    {
      return false;
    }
    
    for (int i=3; i<=Math.sqrt(getal); i+=2)
    {
      if(getal % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}

class NummerFout extends Exception {
	
	Throwable oorzaak = null;
	
	NummerFout(String s) {
		super(s);
	}
	
	NummerFout(String s, Throwable t) {
		super(s, t);
	}
}
