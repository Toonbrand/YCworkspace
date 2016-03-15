package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht19 {
	public static void main(String[] arg){
		System.out.println("Geef een woord op");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int inputLenght = input.length();
		int numberOfAs = 0;

		for(int i=1 ; i<=inputLenght ; i++){
			char checkChar = input.charAt(i-1);
			if(checkChar == 'a' || checkChar == 'A'){
				numberOfAs++;
			}
		}
		System.out.println(numberOfAs);
	}
}
