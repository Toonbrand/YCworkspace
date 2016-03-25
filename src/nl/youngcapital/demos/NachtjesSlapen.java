package nl.youngcapital.demos;

import java.time.*;
import java.util.Scanner;

public class NachtjesSlapen {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geef je geboortedag op");
		int geboortedagDag = s.nextInt();
		System.out.println("Geef je geboortemaand op");
		int geboortedagMaand = s.nextInt();
		System.out.println("Geef je geboortejaar op");
		int geboortedagJaar = s.nextInt();
		
		LocalDate geboortedag = LocalDate.of(geboortedagJaar, geboortedagMaand, geboortedagDag);
		LocalDate vandaag = LocalDate.now();
		
		int geboortedagInJaar = geboortedag.getDayOfYear();
		int vandaagInJaar = vandaag.getDayOfYear();
		int dagenTotgeboortedag = 0;
		
		if(geboortedagInJaar > vandaagInJaar){
			dagenTotgeboortedag = (geboortedagInJaar-vandaagInJaar)+1;
		}
		else{
			dagenTotgeboortedag = (365+(geboortedagInJaar-vandaagInJaar))+1;
		}
		
		LocalDate verjaardag = vandaag.plusDays(dagenTotgeboortedag);
		
		System.out.println("Je geboortedag is " + geboortedag);
		System.out.println("Het is nu " + vandaag);
		System.out.println("Je bent geboren op dag: " + geboortedag.getDayOfWeek());
		System.out.println("Je verjaardag is dit jaar op " + verjaardag);
		System.out.println("Je geboortedag is over " + dagenTotgeboortedag + " dagen.");
		System.out.println("Je verjaardag is op dag: " + verjaardag.getDayOfWeek());
		
	}
}
