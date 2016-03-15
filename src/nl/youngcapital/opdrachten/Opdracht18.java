package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht18 {
	public static void main(String[] arg){
		System.out.println("Geef een getal op");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a=0, b=1, c=1;
		
		for(int i=1 ; i<n ; i++){
			c=b+a;
			a=b;
			b=c;
		}
		System.out.println(c + " is het " + n +"e getal in de Fibonacci series");
	}

}
