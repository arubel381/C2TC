package collections;

import java.util.LinkedList;

public class LinkedExample2 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		System.out.println("Adding elements to the list  "+ thelist);
		thelist.add(1,"Umesh");
		System.out.println("Adding elements to the specific location in the list  "+ thelist);

	}

}
