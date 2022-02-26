package collections1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample2 {

	public static void main(String[] args) {
		SortedSet<String> thelist = new TreeSet();
		thelist.add("Abc");
		thelist.add("Def");
		thelist.add("ghi");
		thelist.add("jkl");
		System.out.println("Sorted Set : "+thelist);
		SortedSet<String> thelist1 = thelist.headSet("ghi"); //strictly less
		SortedSet<String> thelist2 = thelist.tailSet("ghi"); //strictly greater or equal to
		System.out.println("Before ghi : "+thelist1);
		System.out.println("After ghi : "+thelist2);
		System.out.println("Sorted Set : "+thelist);
		

	}

}
