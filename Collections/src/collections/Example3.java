package collections;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<String> thelist = new ArrayList<String>(); // contains() method
		thelist.add("abc");
		thelist.add("def");
		thelist.add("ghi");
		System.out.println("List : " + thelist);
        boolean b = thelist.contains("abc");
        System.out.println("Is abc present in the list : " + b);

	}

}
