package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht17 {
	public static void main(String[] arg){
		System.out.println("Geef een getal op");
		Scanner s = new Scanner(System.in);

		int invoer = s.nextInt();
		boolean isPrime = true;

		for(int i=2;i<invoer/2;i++){

			if(invoer%i == 0){
				isPrime = false;
				break;
			}
			
		}
		if(isPrime){
			System.out.println("This is a prime number");
		}
		else{
			System.out.println("This is not a prime number");
		}
	}
}
