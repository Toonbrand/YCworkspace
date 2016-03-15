package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht10 {
	
	public static void main(String[] args){
		System.out.println("Are you sure you want to quit [Y, N]?");
		Scanner s = new Scanner(System.in);
		char answer = (s.next().charAt(0));
		
		if(answer == 'Y' || answer == 'y'){
			System.out.println("Quitting");
		}
		else if(answer == 'N' || answer == 'n'){
			System.out.println("Not quitting");
		}
		else{
			System.out.println("Press either Y or N");
			
		}
	}

}
