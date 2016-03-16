package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht21 {
	public static void main(String[] args){
		System.out.println("Voer een getal in.");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int inputLength = input.length();
		int totalValue = 0;
		
		//System.out.println(inputLength);	//debug
		
		for(int i=0;i<inputLength;i++){
			int singleNumber = Character.getNumericValue(input.charAt(i));
			totalValue += singleNumber;
		}
		
		System.out.println("Het totaal van de losse getallen samen is " + totalValue);
	}
}
