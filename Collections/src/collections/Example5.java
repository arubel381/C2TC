package collections;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList <Integer> thelist = new ArrayList<Integer>(); // removeAll() method
		ArrayList <Integer> thelist1 = new ArrayList<Integer>();
		thelist.add(10);
		thelist.add(20);
		thelist.add(30);
		thelist1.add(40);
		thelist1.add(50);
		thelist1.add(60);
		System.out.println("Values in 1st list : "+ thelist);
		System.out.println("Values in 2nd list : " +thelist1);
	    thelist.removeAll(thelist1);
	    System.out.println("Removing Values from the list : " +thelist);
	}

}
