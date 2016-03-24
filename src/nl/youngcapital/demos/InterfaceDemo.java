package nl.youngcapital.demos;

public class InterfaceDemo {

	public class Dier {}

	public interface Vlieg { 
		int vleugels = 4;
		void vlieg();
	}

	public abstract interface Broed {
		public abstract void legei();
	}

	public abstract class Vogel extends Dier implements Broed, Vlieg {
		// multiple inheritance!

		// class is abstract dus hier *mag* ik methodes implementeren
		// maar dat hoeft niet
	}

	public class Zwaluw extends Vogel {
		@Override
		public void legei() {}

		@Override
		public void vlieg() {}	
	}

	// let op: vleugels is static!
	public static void main(String[] args){
		System.out.println(Zwaluw.vleugels);
	}

}
