package collections;

import java.util.LinkedList;

public class LinkedExample7 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		thelist.add("Umesh");
		thelist.removeFirstOccurrence("Ramesh");
		System.out.println("Removing first occurred elements from list  "+ thelist);
		LinkedList<String> thelist1 = new LinkedList<String>();
		thelist1.add("Ganesh");
		thelist1.add("Ramesh");
		thelist1.add("Suresh");
		thelist1.add("Unmesh");
		thelist1.removeLastOccurrence("Suresh");
		System.out.println("Removing Last occurred elements from list   "+ thelist1);
		LinkedList<String> thelist2 = new LinkedList<String>();
		thelist2.add("Ganesh");
		thelist2.add("Ramesh");
		thelist2.add("Suresh");
		thelist2.add("Umesh");
		thelist2.add("Unmesh");
		thelist2.clear();
		System.out.println("Removing all elements from list   "+ thelist2);


	}

}
