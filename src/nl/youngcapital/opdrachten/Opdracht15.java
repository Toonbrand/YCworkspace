package nl.youngcapital.opdrachten;

public class Opdracht15 {
	public static void main(String[] arg){

		int totaal = 0;

		for(int i=2; i<20 ; i++){
			if(i % 2 != 0){
			totaal += i;
			}
		}

		System.out.println(totaal);
	}

}
