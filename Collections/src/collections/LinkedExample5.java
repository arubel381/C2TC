package collections;

import java.util.LinkedList;

public class LinkedExample5 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		thelist.add("Umesh");
		thelist.remove("Ganesh");
		System.out.println("Removing elements from list  "+ thelist);
		LinkedList<String> thelist1 = new LinkedList<String>();
		thelist1.add("Ganesh");
		thelist1.add("Ramesh");
		thelist1.add("Suresh");
		thelist1.add("Unmesh");
		thelist1.remove(0);
		System.out.println("Removing elements on the basis of specific position  "+ thelist1);

	}

}
