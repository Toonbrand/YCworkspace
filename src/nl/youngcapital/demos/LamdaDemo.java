package nl.youngcapital.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaDemo {


	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type 
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en een boolean teruggeeft
	 * @return		een nieuwe List terug waarin alleen de data zit waarvoor je predicaat true is.
	 */
	public static <T> List<T> filter(ArrayList<T> data, Predicate<T> p){
		return data.stream().filter(p).collect(Collectors.toList());
	}

	
	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en ook zo'n type teruggeeft
	 * @return		we voeren de lamba uit voor ieder element van data en geven het resultaat terug 
	 */
	public static <T> List<T> map(ArrayList<T> data, Function<T, T> f){
		return data.stream().map(f).collect(Collectors.toList());
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<String> ar2 = new ArrayList<>();

		ar2.add("123");
		ar2.add("1234");
		ar2.add("12345");
		ar2.add("asd");
		ar2.add("asdf");
		ar2.add("asdfg");
		ar2.add("asd.java");
		ar2.add("asdf.java");
		ar2.add("asdfg.java");
		
		for(int x = 0; x < 100; ++x){
			ar.add(x);
		}
		
		System.out.println(
				//filter(ar2, i -> i.length() == 5)
				//filter(ar2, i -> i.endsWith(".java"))
				//map(ar, i -> (int)Math.sqrt(i))
				map(ar2, i -> new StringBuilder(i).reverse().toString())
		);
	}

}
