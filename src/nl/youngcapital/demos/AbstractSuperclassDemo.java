package nl.youngcapital.demos;

public class AbstractSuperclassDemo {
	
	public abstract class Voertuig {
		public abstract String geluid();
		public String beschrijving(){ return "ik ben vrij abstract!"; }
	}
	
	public abstract class Rijtuig extends Voertuig{
		// geen abstracte methodes maar class wel abstract
		
		// geen implementatie van abstracte methode uit superclass
		// class MOET dus abstract zijn
		
		@Override
		public String beschrijving(){ return "ik ben ook abstract!"; }
	}
	
	public abstract class Motorrijtuig extends Rijtuig {
		// geen abstracte methode
		// alles geimplementeerd
		// en toch mag class abstract zijn
		
		@Override
		public String geluid(){ return "Vroem!"; }
	}
	
	public class Fiets extends Rijtuig{
		// concrete class
		@Override
		public String geluid() { return "Tring!"; }
	}
	
	public void demo(){
		Fiets f = new Fiets();
		Voertuig v = f;
		System.out.println(v.geluid());
		System.out.println(v.beschrijving()); // wat gebeurt hier?
	}
	
	public static void main(String[] args) {
		new AbstractSuperclassDemo().demo();
	}
}
