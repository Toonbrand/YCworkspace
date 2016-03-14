package nl.youngcapital.opdrachten;

public class Opdracht5{
	
	public static void main(String[] args){
		int x = 5;
		int y = 1;
		
		if(x / y == 5){
			x = 100;
		}
		else if(x * y == 5){
			x = 1;
		}
		else if(x < y){
			x *= 2;
		}
		else if(x > y){
			x++;
		}
		else{
			System.out.println("But nothing happened.");
		}
		
		System.out.println("x " + x);
		System.out.println("Y " + y);
		
	}
}