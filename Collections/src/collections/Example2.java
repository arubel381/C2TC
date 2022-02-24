package collections;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> thelist = new ArrayList<>(); // clear() method
		thelist.add(10);
		thelist.add(20);
		thelist.add(30);
		System.out.println("Values Before Clear : " + thelist);
        thelist.clear();
        System.out.println("Values After Clear : " + thelist);
	}

}
