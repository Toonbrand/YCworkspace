package nl.youngcapital.demos;

/* Demo voor het gebruik van de toString methode */
public class ToStringDemo {

	private String type;
	private boolean suiker;
	private boolean melk; // wordt niet gebruikt voor tostring
	

	public ToStringDemo(String type, boolean suiker, boolean melk) {
		super();
		this.type = type;
		this.suiker = suiker;
		this.melk = melk;
	}

	@Override
	public String toString() {
		return "Een kop " + this.type + 
				(this.suiker ? " met " : " zonder ") // ternaire operator 
				+ "suiker ";
	}

	public static void main(String[] args) {
		// we kunnen deze objecten nu direct printern
		System.out.println(new ToStringDemo("espresso", false, false));
		
		// of bij strings optellen
		String s = "1 " + new ToStringDemo("cappucino", true, false) + "graag";
		System.out.println(s);
		
		// Dit mag helaas niet
		//	String s = new KopKoffie("a",  true,  true);
	}
	

}
