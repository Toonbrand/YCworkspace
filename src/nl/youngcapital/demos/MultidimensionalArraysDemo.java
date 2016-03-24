package nl.youngcapital.demos;

public class MultidimensionalArraysDemo {

	/* vult een nieuwe rij op basis van de oude 
	 * 
	 * Let op: deze methode retourneert niets
	 * maar verandert de element-waardes van zijn argumenten
	 */
	public static void vulrij(int[] nieuw, int[] oud){
		for(int j=0; j<nieuw.length; ++j){
			if(j == 0 || j == nieuw.length - 1){
				nieuw[j] = 1;
			} else if( j < nieuw.length -1 ){
				nieuw[j] = oud[j-1] + oud[j];
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] triangle = new int[10][];
		
		for(int i=0; i<10; ++i){
			int[] new_row;
			
			if(i == 0){
				new_row = new int[]{ 1 };
			} else {
				new_row = new int[i+1];
				vulrij(new_row, triangle[i-1]);
			}
			
			triangle[i] = new_row;
		}

		for(int[] row: triangle){
			for(int x: row){
				System.out.print(x + " ");
			}
			System.out.println();
		}
	
	}
}
