package collections;

import java.util.List;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		List<Integer> thelist = new ArrayList<>(); // add() & remove () method
		thelist.add(10);
		thelist.add(20);
		thelist.add(30);
		thelist.add(40);
		thelist.add(50);
		for (Integer i : thelist) 
		{
		System.out.println(i);
		}
		System.out.println("Array List Using add() method: " + thelist);
		
		thelist.remove(0);
		for (Integer i : thelist)
		{
		System.out.println(i);
		}
		System.out.println("Array List Using remove() method : " + thelist);
	}

}
