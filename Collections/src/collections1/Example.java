package collections1;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		String[] str = {"brown","yellow","red", "blue", "orange","green","white","black"};
		List<String> thelist = Arrays.asList(str);
		TreeSet<String> thelist1 = new TreeSet<String>(thelist);
		System.out.println(thelist1);
	}

}
