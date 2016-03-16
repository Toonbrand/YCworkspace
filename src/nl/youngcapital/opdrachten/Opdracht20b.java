package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht20b {
	public static void main(String[] arg){
		System.out.println("Geef een letter op");
		Scanner s = new Scanner(System.in);
		char input = s.next().charAt(0);
		int inputVal = Integer.valueOf(input);
		int inputPos;

		System.out.println(inputVal); //debug


		if(inputVal >= 97){ //kleine letter
			char firstLetter = 'a';
			int firstVal = Integer.valueOf(firstLetter);
			inputPos = inputVal - firstVal;

		}

		else{	//hoofdletter
			char firstCapital = 'A';
			int firstCapVal = Integer.valueOf(firstCapital);
			inputPos = inputVal - firstCapVal;
		}
		System.out.println(inputPos + 1);
	}
}
