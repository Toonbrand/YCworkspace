package nl.youngcapital.stringoefeningen;

import java.util.Scanner;

public class Oefening1_rot13 {
	public static void main(String[] arg){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int inputLenght = input.length();
		
		for(int i=0; i<inputLenght; i++){
			
			char oldChar = input.charAt(i);
			int oldCharValue = Integer.valueOf(oldChar);
			int newCharValue = oldCharValue + 13;
			if(newCharValue > 'a' + 25){
				newCharValue -= 26;
			}
			char newChar = (char)newCharValue;
			
			input = input.replace(oldChar, newChar);
			}
		
		System.out.println(input);
	}
}
