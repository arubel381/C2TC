package collections;

import java.util.LinkedList;

public class LinkedExample11 {

	public static void main(String[] args) {
		LinkedList<String> thelist1 = new LinkedList<String>();
		thelist1.add("Ramesh");
		thelist1.add("Suresh");
		thelist1.add("Ganesh");
		thelist1.add("Umesh");
		System.out.println("Initial List : "+ thelist1);
		System.out.println("Peek List : "+ thelist1.peek());
		LinkedList<String> thelist2 = new LinkedList<String>();
		thelist2.add("Ganesh");
		thelist2.add("Ramesh");
		thelist2.add("Suresh");
		thelist2.add("Umesh");
		System.out.println("Initial List : "+ thelist2);
		System.out.println("Peek First List : "+ thelist2.peekFirst());
		LinkedList<String> thelist3 = new LinkedList<String>();
		thelist3.add("Ganesh");
		thelist3.add("Ramesh");
		thelist3.add("Suresh");
		thelist3.add("Umesh");
		System.out.println("Initial List : "+ thelist3);
		System.out.println("Peek Last List : "+ thelist3.peekLast());

	}

}
