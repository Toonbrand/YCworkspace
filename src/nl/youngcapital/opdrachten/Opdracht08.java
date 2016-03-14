package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht08 {
	public static void main(String[] args){
		System.out.println("Please enter 3 values.");
		Scanner s = new Scanner(System.in);

		int number1 = Integer.valueOf(s.next());
		int number2 = Integer.valueOf(s.next());
		int number3 = Integer.valueOf(s.next());

		// if number 1 is the greatest
		if(number1 > number2 && number1 > number3){
		System.out.println(number1);
		}

		// if number 2 is the greatest
		else if(number2 > number1 && number2 > number3){
		System.out.println(number2);
		}

		// if number 3 is the greatest
		else if(number3 > number2 && number3 > number1){
		System.out.println(number3);
		}
	}

}
