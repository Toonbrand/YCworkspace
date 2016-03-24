package nl.youngcapital.dierenoefening;

public class DierenOefening {

	public void demo(){		
		Dier giraffe = new Dier("Giraffe");
		Vogel kievit = new Vogel("Kievit");
		
		System.out.println(giraffe.getNaam()); 
		System.out.println(kievit.getNaam());
		
		DierenWinkel dw = new VogelSpeciaalzaak();
		for(Dier d: dw.getVoorraad()){System.out.println(d.naam);}
	}
	
	public static void main(String[] args){
		new DierenOefening().demo();
	}

}
