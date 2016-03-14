package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht03 {
	
	public static void main(String[] arg){
		System.out.println("Lengte driehoek berekenen.");
		System.out.println("Voer de lengte van de eerste zijde in:");
		Scanner s = new Scanner(System.in);
		Double lengte1 = Double.valueOf(s.next());
		
		System.out.println("Voer de lengte van de tweede zijde in:");
		Double lengte2 = Double.valueOf(s.next());
		
		Double lengte3 = lengte1 + lengte2;
		System.out.println("De lengte van de derde zijde is " + lengte3);
	}

}
