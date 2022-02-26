package collections1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample3 {

	public static void main(String[] args) {
		SortedSet<String> thelist = new TreeSet<String>();
		thelist.add("Practicing");
		thelist.add("Core Java");
		thelist.add("Topic");
		thelist.add("Collection");
		System.out.println("Sorted Set : "+thelist);
		Object[] o = thelist.toArray();
		System.out.println("Array : ");
		for(int i=0; i<o.length;i++)
		{
			
			System.out.println(o[i]);
		}
	}
}
