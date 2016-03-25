package nl.youngcapital.demos;

public class ThrowDemo2 {
	public static void main(String[] args){

		try{
			String dag = naamVanDeWeekDag(-1000);
			System.out.println(dag);
		}
		
		catch(IllegalArgumentException e){
			System.out.println("Geen geldige dag");	
		} 
		
		catch (DatIsGeenWeekDag e) {
			System.out.println("Geen geldige dag 2");
		}
	}


	static String naamVanDeWeekDag(int dag) throws DatIsGeenWeekDag{
		String dagnaam = "";
		switch(dag){
		case 1: dagnaam = "Maandag";
		break;
		case 2: dagnaam = "Dinsdag";
		break;
		case 3: dagnaam = "Woensdag";
		break;
		case 4: dagnaam = "Donderdag";
		break;
		case 5: dagnaam = "Vrijdag";
		break;
		case 6: dagnaam = "Zaterdag";
		break;
		case 7: dagnaam = "Zondag";
		break;
		//default: throw new IllegalArgumentException(dag + " is not a valid day, stupid.");
		default: throw new DatIsGeenWeekDag();
		}
		return dagnaam;
	}
	
	static class DatIsGeenWeekDag extends Exception{}
}

