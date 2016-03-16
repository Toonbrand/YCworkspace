package nl.youngcapital.opdrachten;

public class OefenOpdracht {
	public static void main(String[] arg){
		int firstValue = 1;
		int secondValue = 2;
		
		System.out.println(pastIn(firstValue, secondValue));
	}
	
	static int aantalbytes(int val){
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
