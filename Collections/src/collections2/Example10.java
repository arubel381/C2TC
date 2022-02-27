package collections2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Example10 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> thelist = new TreeMap<Integer,String>();
		thelist.put(1,"abc");
		thelist.put(4,"def");
		thelist.put(3,"Ghi");
		thelist.put(2,"Jkl");
		System.out.println("Sorted Set : "+thelist);
		System.out.println("Poll Last Entry : "+thelist.pollLastEntry());
		System.out.println("Final Set : "+thelist);
		

	}

}
