package collections2;

import java.util.SortedMap;
import java.util.TreeMap;

public class Example6 {

	public static void main(String[] args) {
		SortedMap<Integer,String> thelist = new TreeMap<Integer,String>();
		thelist.put(1,"abc");
		thelist.put(2,"def");
		thelist.put(3,"Ghi");
		thelist.put(4,"Jkl");
		System.out.println("Sorted Set : "+thelist);
		System.out.println("First : "+thelist.firstEntry());
		System.out.println("Last : "+thelist.lastEntry());

	}

}
