package collections2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class HeadMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer,String> thelist = new TreeMap<Integer,String>();
		thelist.put(1,"abc");
		thelist.put(4,"def");
		thelist.put(3,"Ghi");
		thelist.put(2,"Jkl");
		thelist.put(5,"mno");
		thelist.put(7,"pqr");
		thelist.put(6,"Stu");
		System.out.println("Sorted Set : "+thelist);
		System.out.println("Final Set : "+thelist.headMap(5));

	}

}
