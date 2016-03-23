package nl.youngcapital.opdrachten;

import java.util.ArrayList;
import java.util.ListIterator;

public class Opdracht22 {
	public static void main(String[] args){
		ArrayList<Integer> priemGetallen = new ArrayList<Integer>();
		priemGetallen.add(2);
		priemGetallen.add(3);
		priemGetallen.add(5);
		priemGetallen.add(7);
		priemGetallen.add(11);
		priemGetallen.add(13);
		priemGetallen.add(17);
		priemGetallen.add(19);
		priemGetallen.add(23);
		priemGetallen.add(29);
		
		ListIterator<Integer> iterator = priemGetallen.listIterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
