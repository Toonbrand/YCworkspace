package nl.youngcapital.opdrachten;

public class OefenOpdracht {
	public static void main(String[] arg){
		String firstValue = "asdf";
		String secondValue = "asdfasdf";
		
		System.out.println(pastIn(firstValue, secondValue));
	}
	
	static int aantalbytes(int val){
		return (byte)val;
	}
	
	static int aantalbytes(String val){
		return (byte)val;
	}
	
	static boolean pastIn(int a, int b){
		a = aantalbytes(a);
		b = aantalbytes(b);
		
		if(a<b){
			return true;
		}
		else{
			return false;
		}
	}
}
