package collections1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddAllExample {

	public static void main(String[] args) {
		Set<Integer> thelist = new LinkedHashSet<Integer>(); 
		thelist.add(10);
		thelist.add(20);
		thelist.add(30);
		System.out.println("Set : " + thelist);
		ArrayList <Integer> thelist1 = new ArrayList<Integer>();
		thelist1.add(40);
		thelist1.add(50);
		thelist1.add(60);
		thelist.addAll(thelist1);
		System.out.println("Set : " + thelist1);
	}

}
