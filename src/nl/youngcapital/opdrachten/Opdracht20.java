package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht20 {
	public static void main(String[] arg){
		System.out.println("Geef een letter op");
		Scanner s = new Scanner(System.in);
		//char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char input = s.next().charAt(0);

		for(int i=0 ; i<52 ; i++){
			if(input == alpha.charAt(i)){
				if(i>25){
					System.out.println(i-26+1);
				}
				else{
					System.out.println(i+1);
				}
			}
		}
	}

}
