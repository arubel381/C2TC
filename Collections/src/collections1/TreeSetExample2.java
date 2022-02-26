package collections1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> thelist = new TreeSet<String>(Arrays.asList("brown","yellow","red", "blue", "orange","green","white","black"));
		System.out.println(thelist);
		Set<String> thelist1 = thelist.subSet("green",false, "white", true);
		System.out.println("Sub Set : "+thelist1);
		Set<String> thelist2 = thelist.subSet("green",true, "white", true);
		System.out.println("Sub Set : "+thelist2);
		Set<String> thelist3 = thelist.subSet("green",false, "white", false);
		System.out.println("Sub Set : "+thelist3);

	}

}
