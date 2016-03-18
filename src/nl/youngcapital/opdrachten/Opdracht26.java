package nl.youngcapital.opdrachten;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht26 {
	public static void main(String[] arg){
		System.out.println("Geef 10 getallen op ");
		Scanner s = new Scanner(System.in);
		int[] numbers = new int[10];

		for(int i = 0; i<10; i++){
			int input = s.nextInt();
			if(noDoubles(numbers, input)){
				numbers[i] = input;
			}
			else{
				i-=1;
			}
		}

		for(int i=0; i<10; i++){
			System.out.println("Opgeslagen getallen: " + numbers[i]);
		}
	}
	
	public static boolean noDoubles(int[] arr, int target){
		for(int i: arr){
			if(i == target){
				return false;
			}
		}
		
		return true;
	}
}
