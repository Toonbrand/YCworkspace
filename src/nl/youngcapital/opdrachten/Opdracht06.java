package nl.youngcapital.opdrachten;

import java.util.Scanner;

public class Opdracht06 {

	public static void main(String[] args) {
		System.out.println("Voer 5 scores in.");
		Scanner s = new Scanner(System.in);
		Double grade1 = Double.valueOf(s.next());
		Double grade2 = Double.valueOf(s.next());
		Double grade3 = Double.valueOf(s.next());
		Double grade4 = Double.valueOf(s.next());
		Double grade5 = Double.valueOf(s.next());
		int highGrades = 0;
		
		if(grade1 > 7){
			highGrades++;
		}
		if(grade2 > 7){
			highGrades++;
		}
		if(grade3 > 7){
			highGrades++;
		}
		if(grade4 > 7){
			highGrades++;
		}
		if(grade5 > 7){
			highGrades++;
		}
		
		System.out.println("Er zijn "+ highGrades +" scores hoger dan 7.");
	}

}
