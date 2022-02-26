package collections1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample1 {

	public static void main(String[] args) {
			SortedSet<String> thelist = new TreeSet();
			thelist.add("abc");
			thelist.add("def");
			thelist.add("Ghi");
			thelist.add("Jkl");
			System.out.println("Sorted Set : "+thelist);
			System.out.println("First : "+thelist.first());
			System.out.println("Last : "+thelist.last());
			
	}

}
