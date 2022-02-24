package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {

	public static void main(String[] args) {
		ArrayList <Integer> thelist = new ArrayList<Integer>(); //rotate() , sort() & reverseOrder() method using collections
		thelist.add(1);
		thelist.add(2);
		thelist.add(6);
		thelist.add(7);
		thelist.add(3);
		thelist.add(4);
		thelist.add(5);
		thelist.add(8);
		System.out.println("Original List : " + thelist);
		Collections.rotate(thelist, 1);
		System.out.println("Rotated List : " + thelist);
		Collections.sort(thelist);
		System.out.println("Sorted List : " + thelist);
		Collections.sort(thelist, Collections.reverseOrder());
		System.out.println("Reverse List : " + thelist);

	}

}
