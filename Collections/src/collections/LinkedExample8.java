package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample8 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		Iterator i = thelist.descendingIterator();
		System.out.println("Reverse a list of elements from the list : ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
