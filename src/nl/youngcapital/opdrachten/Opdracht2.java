package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht2 {

	public static void main(String[] args)
	{
		System.out.println("Voer een aantal graden in");
		
		Scanner s = new Scanner(System.in);
		String input = s.next();
		Double farenheid = (Double.valueOf(input) * 1.8) + 32;
		
		System.out.println("Dat is " + farenheid + " farenheid");
	}
}
