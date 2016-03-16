package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht23 {
	public static void main(String[] args){
		String[] names = {"Henk", "Piet", "Klaas"};
		String[] birthDays = {"11-11-1911", "22-22-1922", "33-33-1933"};
		String[] phoneNrs = {"06-6666666", "06-7777777", "06-88888888"};

		System.out.println("Geef een naam op");
		
		Scanner s = new Scanner(System.in);
		String input = s.next();

		for(int i = 0; i<names.length ; i++){
			if(input .equalsIgnoreCase(names[i])){
				System.out.println("Informatie over klant:");
				System.out.println(names[i]);
				System.out.println(birthDays[i]);
				System.out.println(phoneNrs[i]);
				break;
			}
			System.out.println("Doorzoekt database");

		}
		System.out.println("Naam niet gevonden in klantendatabase");
	}
}
