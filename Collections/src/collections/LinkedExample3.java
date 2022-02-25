package collections;

import java.util.LinkedList;

public class LinkedExample3 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		LinkedList<String> thelist1 = new LinkedList<String>();
		thelist1.add("Suresh");
		thelist1.add("Umesh");
		thelist.addAll(thelist1);
		System.out.println("Adding second list elements to the first list  "+ thelist);
		thelist.addAll(1,thelist1);
		System.out.println("Adding second list elements to the first list at specific position in the list  "+ thelist);

	}

}
