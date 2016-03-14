package nl.youngcapital.opdrachten;

public class Opdracht07 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		if(x*y==8){
			x=1;
		}
		else{
			x++;
		}
		
		 if(x<y){
		x*=2;	
		}
		 else{
			 x++;
		 }
		 
		 if(x>y){
			 x++;
			 y++;
		 }
		 else{
			 x--;
			 y--;
		 }
		
		 System.out.println("X "+x);
		 System.out.println("Y "+y);
	}

}
