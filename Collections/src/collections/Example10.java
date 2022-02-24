package collections;

import java.util.ArrayList;
import java.util.List;

public class Example10 {

	public static void main(String[] args) {
		List<Integer> thelist = new ArrayList<>(); // get() & set() method
		thelist.add(10);
		thelist.add(20);
		thelist.add(30);
		thelist.add(40);
		System.out.println("Original List: " +thelist);
        System.out.println(thelist.get(0));
        System.out.println(thelist.get(2));
        thelist.set(1,2);
        thelist.set(3,4);
        System.out.println("List: " +thelist);
	}

}
