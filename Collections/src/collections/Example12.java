package collections;

import java.util.ArrayList;

public class Example12 {

	public static void main(String[] args) {
		ArrayList<String> thelist = new ArrayList<String>(); //isEmpty() Method
        thelist.add("abc");
        thelist.add("def");
        thelist.add("ghi");
        thelist.add("jkl");
        System.out.println("Original List : " + thelist);
        System.out.println("Is List Empty : " + thelist.isEmpty());
	}

}
