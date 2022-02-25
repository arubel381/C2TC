package collections;

import java.util.LinkedList;

public class LinkedExample4 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		thelist.addFirst("Umesh");
		System.out.println("Adding elements at first position  "+ thelist);
		LinkedList<String> thelist1 = new LinkedList<String>();
		thelist1.add("Ganesh");
		thelist1.add("Ramesh");
		thelist1.add("Suresh");
		thelist1.addLast("Unmesh");
		System.out.println("Adding elements at last position  "+ thelist1);

	}

}
