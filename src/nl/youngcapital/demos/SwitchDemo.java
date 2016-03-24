package nl.youngcapital.demos;

public class SwitchDemo {
    // enums horen niet bij het examen
    enum Eenheid {
		STUK,
		KILO,
		PAK,
		FLES,
		GRAM,
		KUUB
	}

	public static String eenheidBeschrijving(Eenheid e){
		String result /*= "?!"*/; // commentaar veroorzaakt fout
		switch(e){
		case KILO:
		case GRAM:
			result = "massa-eenheid";
			break;
		case PAK:
		case FLES:
			result = "verpakking";
			break;
		case KUUB:
			result = "volume-eenheid";
			break;
		case STUK:
			result = "stuks";
			// break; // LET OP missing break
		default:
			result = "kan niet!";
		}
		return result;
	}

	public static void main(String[] args) {
		Eenheid e = Eenheid.STUK;

		System.out.println(eenheidBeschrijving(e));
	}
}
