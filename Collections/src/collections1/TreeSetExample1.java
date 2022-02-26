package collections1;

import java.util.Set;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<String> thelist = new TreeSet<String>(Arrays.asList("brown","yellow","red", "blue", "orange","green","white","black"));
		System.out.println(thelist);
		Set<String> thelist1 = thelist.subSet("green", "white");
		System.out.println("Sub Set : "+thelist1);
		Set<String> thelist2 = thelist.subSet("blue", "black");
		System.out.println("Sub Set : "+thelist2);

	}

}
