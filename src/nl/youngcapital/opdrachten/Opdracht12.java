package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht12 {

	public static void main(String[] arg){
		System.out.println("Voer drie lengtes in.");
		Scanner s = new Scanner(System.in);
		int lengte1 = s.nextInt();
		int lengte2 = s.nextInt();
		int lengte3 = s.nextInt();
		
		if(lengte1 + lengte2 > lengte3 && lengte2 + lengte3 > lengte1 && lengte1 + lengte3 > lengte2){
			System.out.println("Dit is inderdaad een driehoek");
		}
		else{
			System.out.println("Dit is geen driehoek");
		}
	}
}
