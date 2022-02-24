package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {

	public static void main(String[] args) {
		ArrayList <Integer> thelist = new ArrayList<Integer>(); //fill() method using collections
		thelist.add(1);
		thelist.add(2);
		thelist.add(4);
		thelist.add(5);
		System.out.println("List Before Replacing  : " + thelist);
		Collections.fill(thelist, 3);
		System.out.println("List After Replacing: " + thelist);
	}
}
