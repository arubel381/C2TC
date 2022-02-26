package collections1;

import java.util.LinkedHashSet;

public class RetainAllExample {

	public static void main(String[] args) {
		LinkedHashSet<String> thelist = new LinkedHashSet<String>(); 
        thelist.add("Java");
        thelist.add("Javascript");
        thelist.add("HTML");
        thelist.add("CSS");
        System.out.println(thelist);
        LinkedHashSet<String> thelist1 = new LinkedHashSet<String>();
        thelist1.add("HTML");
        thelist1.add("CSS");
        System.out.println(thelist1);
        thelist.retainAll(thelist1);
        System.out.println(thelist);
        

	}

}
