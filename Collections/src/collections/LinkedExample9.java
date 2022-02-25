package collections;

import java.util.LinkedList;

public class LinkedExample9 {

	public static void main(String[] args) {
		LinkedList<String> thelist = new LinkedList<String>();
		thelist.add("Ganesh");
		thelist.add("Ramesh");
		thelist.add("Suresh");
		thelist.add("Umesh");
		System.out.println(thelist);
		String s = "Ramesh";
		boolean b = thelist.contains(s); //using contains() method
		if(b)
		{
			System.out.println("Output : "+thelist.indexOf(s));
		}

	}

}
