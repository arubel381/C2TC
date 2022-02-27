package collections2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

	public static void main(String[] args) {
		NavigableMap<Character,String> thelist = new TreeMap<Character,String>();
		thelist.put('b',"abc");
		thelist.put('a',"def");
		thelist.put('c',"Ghi");
		thelist.put('d',"Jkl");
		System.out.println("Sorted Set : "+thelist);
		System.out.println("Sub Map : "+thelist.subMap('b','d'));

	}

}
