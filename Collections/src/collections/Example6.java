package collections;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {
		List<String> thelist = new ArrayList<String>(); // subList() method
		thelist.add("abc");
		thelist.add("def");
		thelist.add("ghi");
		thelist.add("jkl");
		thelist.add("mno");
		System.out.println("ArrayList : " + thelist);
		List<String> list = thelist.subList(0, 3);
        System.out.println("Sub List : " + list);
	}

}
