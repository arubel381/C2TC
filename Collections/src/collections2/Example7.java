package collections2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Example7 {

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
		System.out.println("Head Map : "+thelist.headMap(5));
		System.out.println("Tail Map : "+thelist.tailMap(5));
		System.out.println("Sub Map : "+thelist.subMap(3,8));

	}

}
