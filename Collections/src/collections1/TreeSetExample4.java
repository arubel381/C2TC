package collections1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample4 {

	public static void main(String[] args) {
		TreeSet<String> thelist = new TreeSet<String>(Arrays.asList("brown","yellow","red", "blue", "orange","green","white","black"));
		System.out.println("Sorted List : " + thelist);
		Set<String> thelist1 = thelist.subSet("green","white");
		System.out.println("Sub Set : "+ thelist1);
		thelist1= thelist.subSet("black","brown");
		System.out.println("Sub Set : "+ thelist1);

	}

}
