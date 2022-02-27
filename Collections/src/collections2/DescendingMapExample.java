package collections2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DescendingMapExample {

	public static void main(String[] args) {
		NavigableMap<Character,String> thelist = new TreeMap<Character,String>();
		thelist.put('b',"abc");
		thelist.put('a',"def");
		thelist.put('c',"Ghi");
		thelist.put('d',"Jkl");
		System.out.println("Sorted Set : "+thelist);
		NavigableMap thelist1 = thelist.descendingMap();
		System.out.println("Final Set : "+thelist1);

	}

}
