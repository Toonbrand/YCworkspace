package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht11 {

	public static void main(String[] args) {
		System.out.println("Please insert product number and quantity");
		Scanner s = new Scanner(System.in);
		int productnr = Integer.valueOf(s.next());
		int productquant = Integer.valueOf(s.next());
		int totalprice = 0;
		for(int i=1; i<=productquant; i++){
			
			if(productnr == 1){
				totalprice += 295;
			}
			else if(productnr == 2){
				totalprice += 499;
			}
			else if(productnr == 3){
				totalprice += 549;
			}
			else if(productnr == 4){
				totalprice += 780;
			}
			else if(productnr == 5){
				totalprice += 885;
			}
		}
		
		double priceineuros = (double)totalprice/100;
		System.out.println("That'll be a total of " + priceineuros + " million euro.");
	}

}
