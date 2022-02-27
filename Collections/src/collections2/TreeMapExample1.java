package collections2;

import java.util.TreeMap;
import java.util.SortedMap;
public class TreeMapExample1 {

	public static void main(String[] args) {
		SortedMap<Integer,String> thelist = new TreeMap<Integer,String>();
		thelist.put(3,"three");
		thelist.put(2,null);
		thelist.put(1,"one");
		thelist.put(4,"four");
		thelist.put(6,"null");
		thelist.put(5,"five");
		System.out.println(thelist);

	}

}
