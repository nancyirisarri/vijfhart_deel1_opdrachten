import java.util.*;

class KaartSpel {

	public static void main(String args[]) {
		System.out.println("Will shuffle and print out a deck of cards. Try out several times to see randomness!\n");
		
		ArrayList<Integer> reeks = new ArrayList<>();
		
		for(int i = 1; i < 14; i++) {reeks.add(i);}

		Map<String, ArrayList> kaarten = new HashMap<>();

		Collections.shuffle(reeks);
		kaarten.put("H", reeks);
		//System.out.println(kaarten.get("H"));		
		
		ArrayList<Integer> reeks1 = new ArrayList<>(reeks);
		Collections.shuffle(reeks1);
		kaarten.put("R", reeks1);
		//System.out.println(kaarten.get("R"));		
		
		ArrayList<Integer> reeks2 = new ArrayList<>(reeks);
		Collections.shuffle(reeks2);
		kaarten.put("K", reeks2);
		//System.out.println(kaarten.get("K"));		
		
		ArrayList<Integer> reeks3 = new ArrayList<>(reeks);
		Collections.shuffle(reeks3);
		kaarten.put("S", reeks3);
		//System.out.println(kaarten.get("S"));		
		
		Map<String, Integer> dealt = new HashMap<>();
		
		int row = 0;
		int column = 0;
		boolean allEmpty = false;
		
		while(allEmpty == false) {
			int nummer = (int)Math.ceil(13* Math.random());	
			String kleur = getKleur();
		
			int indx = kaarten.get(kleur).indexOf(nummer);
			
				
			if(indx >= 0) {
				System.out.printf(kleur + kaarten.get(kleur).get(indx) + ", ");
				column += 1;
				
				if(column == 13) {
				  System.out.println("\n");	
				  column = 0;
				}

				kaarten.get(kleur).remove(indx);
			}
			
			if(kaarten.get("S").isEmpty() == true & kaarten.get("H").isEmpty() == true & kaarten.get("R").isEmpty() == true & kaarten.get("K").isEmpty() == true) {
			  	allEmpty = true;
			}
		}

	}

	static String getKleur() {
		
		int kleur = (int)Math.ceil(4* Math.random());

		switch(kleur) {
		  case 1:
			return "H";
		  case 2:
		    return "R";
		  case 3:
		    return "K";
		  case 4:	
		    return "S";
		}
		return null;
	}

}
