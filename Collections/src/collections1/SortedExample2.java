package collections1;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SortedExample2 {

	public static void main(String[] args) {
		SortedSet<String> thelist = new TreeSet();
		thelist.add("abc");
		thelist.add("def");
		thelist.add("Ghi");
		thelist.add("Jkl");
		System.out.println("Sorted Set : "+thelist);
		Iterator thelist1 = thelist.iterator();
		System.out.println("After Iterator : ");
		while(thelist1.hasNext())
		{
			System.out.println(thelist1.next());
		}
	}

}
