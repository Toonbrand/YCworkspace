package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht13 {

	public static void main(String[] arg){
		System.out.println("Voer drie lengtes in.");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a*a + b*b == c*c || c*c + a*a == b*b || b*b + c*c == a*a){
			System.out.println("Dit is een rechte driehoek");
		}
		else{
			System.out.println("Dit is geen rechte driehoek");
		}
	}
}
