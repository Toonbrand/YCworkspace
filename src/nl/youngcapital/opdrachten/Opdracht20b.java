package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht20b {
	public static void main(String[] arg){
		System.out.println("Geef een letter op");
		Scanner s = new Scanner(System.in);
		char input = s.next().charAt(0);
		
		char A = 'a';
		int pos = A -= input;
		
		System.out.println(pos);
	}
}
