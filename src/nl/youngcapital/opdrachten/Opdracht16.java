package nl.youngcapital.opdrachten;

public class Opdracht16 {
	public static void main(String[] arg){
		
		int n = 5;
		String getallenReeks = "";
		
		for(int i = 0; i<10 ;i++){
			n += 4;
			getallenReeks = getallenReeks + n + " ";
		}
		System.out.println(getallenReeks);
	}

}
