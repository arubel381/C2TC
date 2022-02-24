package collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> thelist = new ArrayList<>(); // addAll() method
		thelist.add(10);
		thelist.add(20);
		List<Integer> thelist1 = new ArrayList<>();
		thelist1.add(30);
		thelist1.add(40);
		thelist1.addAll(thelist);
		System.out.println(thelist1);

	}

}
