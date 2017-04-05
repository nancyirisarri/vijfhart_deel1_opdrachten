import java.util.*;

abstract class Vorm implements Comparable<Vorm> {
	abstract float getOppervlakte();
	
	public int compareTo(Vorm v) {
		return getOppervlakte() > v.getOppervlakte() ? 1:
		getOppervlakte() < v.getOppervlakte() ? -1 : 0;
	};
}

class Cirkel extends Vorm {
  double straal;

  Cirkel(double straal) {
	this.straal = straal;  
  };

  float getOppervlakte(){
    return (float)(Math.PI * Math.pow(straal, 2));
  };
  
  public String toString() {
	return "Cirkel met straal " + straal + " en oppervlakte " + getOppervlakte();  
  }
  
}

class Vierkant extends Vorm {
  double zijde;

  Vierkant(double zijde) {
	this.zijde = zijde;  
  };
  
  float getOppervlakte(){
    return (float)Math.pow(zijde, 2);
  }; 

  public String toString() {
	return "Vierkant met zijde " + zijde + " en oppervlakte " + getOppervlakte();  
  }
}

class VormApp {
	
	public static void main(String args[]) {
	  Collection<Vorm> list = new TreeSet<Vorm>();
	
	  list.add(new Cirkel(5));
	  list.add(new Cirkel(7));
	  list.add(new Vierkant(4));
	  list.add(new Vierkant(8));

	  System.out.println(list);	
	}

}
