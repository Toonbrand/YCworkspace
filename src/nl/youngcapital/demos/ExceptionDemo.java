package nl.youngcapital.demos;

public class ExceptionDemo {
	
	public static void main(String[] args){
		
		try{
			twoExceptions("asdf");
		}
		catch(NumberFormatException e){
			System.out.println("Got a numberformat exeption, input: " + e.getMessage());
		}
		catch(NullPointerException e){
			System.out.println("Got a nullpointer exception, input: " + e.getMessage());
		}
		
//		twoExceptions("asdf");
	}
	
	static int twoExceptions(String getal){
	    return Integer.valueOf(getal.trim());
	}
}
