package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht24 {
	static public void main(String[] arg){
		String[] products = {"Kaas", "Boter", "Bloemkool"};
		String[] prices = {"3.50", "2.99", "8.49"};

		System.out.println("Geef het product op");
		Scanner s = new Scanner(System.in);

		String input = s.nextLine();

		for(int i = 0; i<products.length; i++){
			if(input .equals(products[i])){
				System.out.println(products[i] + "kost " + prices[i] + " miljoen euro.");
				break;
			}
		}
	}
}
