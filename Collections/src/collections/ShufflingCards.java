package collections;

import java.util.*;

public class ShufflingCards {

	public static void main(String[] args) {
		ArrayList <Integer> thelist = new ArrayList<Integer>();
		thelist.add(1);
		thelist.add(2);
		thelist.add(3);
		thelist.add(4);
		thelist.add(5);
		thelist.add(6);
		thelist.add(7);
		thelist.add(8);
		System.out.println("Original List : " + thelist);
		Collections.shuffle(thelist);
		System.out.println("Shuffle List : " + thelist);
	}

}
