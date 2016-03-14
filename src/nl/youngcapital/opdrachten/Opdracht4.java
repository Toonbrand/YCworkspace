package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		System.out.println("Volume en oppervlakte kubus berekenen.");
		System.out.println("Voer de lengte in");
		Scanner s = new Scanner(System.in);
		Double length = Double.valueOf(s.next());
		
		System.out.println("Voer de breedte in");
		Double width = Double.valueOf(s.next());
		
		System.out.println("Voer de diepte in");
		Double height = Double.valueOf(s.next());
		
		Double volume = length * width * height;
		Double surface = 2*((length * width) + (length * height) + (width * height));
		System.out.println("Het volume van de kubus is " + volume + " en de oppervlakte is " + surface);
	}

}
