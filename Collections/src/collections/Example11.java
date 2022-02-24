package collections;

import java.util.ArrayList;

public class Example11 {

	public static void main(String[] args) {
		ArrayList<String> thelist = new ArrayList<String>(); // clone() method
		Object clonelist;
		thelist.add("C++");
        thelist.add("JAVA");
        thelist.add("PHP");
        System.out.println("Original List: " + thelist);
        clonelist = thelist.clone();
        System.out.println("Clone List: " + clonelist);

	}

}
