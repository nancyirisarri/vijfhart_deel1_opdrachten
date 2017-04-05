class Rechthoek {
  protected double hoogte;
  protected double breedte;

  public Rechthoek() {};
  
  public Rechthoek(double breedte, double hoogte) {
	this.breedte = breedte;
	this.hoogte = hoogte;
  }

  protected double oppervlakte() {
    return this.breedte * this.hoogte;  
  }
}

class Vierkant extends Rechthoek {
  //breedte = hoogte

  public Vierkant() {};

  public Vierkant(double breedte) {
	super(breedte, breedte);
  }

}

class Balk extends Rechthoek {
  protected double diepte;
  
  public Balk() {};
  
  public Balk(double breedte, double hoogte, double diepte) {
	this.breedte = breedte;
	this.hoogte = hoogte;
	this.diepte = diepte;
  }

  protected double oppervlakte() {
	return 2*(super.oppervlakte() + this.hoogte*this.diepte + this.breedte*this.diepte);
  }  

  protected double inhoud() {
	return super.oppervlakte() * this.diepte;
  }
}

class Kubus extends Balk {
  //breedte = hoogte = diepte

  public Kubus() {};
  
  public Kubus(double breedte) {
	super(breedte, breedte, breedte);  
  }
}

class Vormen {
  public static void main(String args[]) {
	Rechthoek rechthoek = new Rechthoek(5D, 4D);  
	System.out.println(rechthoek.breedte);
	System.out.println(rechthoek.hoogte);
	System.out.println(rechthoek.oppervlakte());

	System.out.println("#####################");

	Vierkant vierkant = new Vierkant(5D);
	System.out.println(vierkant.breedte);
	System.out.println(vierkant.hoogte);
	System.out.println(vierkant.oppervlakte());

	System.out.println("#####################");

	Balk balk = new Balk(5D, 4D, 6D);
	System.out.println(balk.oppervlakte());
	System.out.println(balk.inhoud());

	System.out.println("#####################");

	Kubus kubus = new Kubus(5D);
	System.out.println(kubus.oppervlakte());
	System.out.println(kubus.inhoud());
  }
}
