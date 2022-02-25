package collections;

import java.util.LinkedList;

public class LinkedExample6 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Unmesh");
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		thelist.add("Umesh");
		thelist.removeFirst();
		System.out.println("Removing first elements from the list  "+ thelist);
		thelist.removeLast();
		System.out.println("Removing last elements from the list  "+ thelist);

	}

}
