package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht25 {
	public static void main(String[] arg){
		String[] months = {"Januari", "Februari",  "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December", };
		int[] highTemps = new int[12];
		int[] lowTemps = new int[12];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 12; i++){
			System.out.println("Geef de hoogste en laagste temperatuur van " + months[i] + " op");
			
			int highTemp = s.nextInt();
			int lowTemp = s.nextInt();
			
			highTemps[i] = highTemp;
			lowTemps[i] = lowTemp;
		}
		
		for(int i = 0; i < months.length; i++){
			System.out.println("Temperaturen in " + months[i] + ":");
			System.out.println("Hoogst: " + highTemps[i]);
			System.out.println("Laagst: " + lowTemps[i]);
		}
		
	}

}
