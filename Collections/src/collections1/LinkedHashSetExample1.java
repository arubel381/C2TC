package collections1;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {
		LinkedHashSet<String> thelist = new LinkedHashSet<String>(); 
        thelist.add("Java");
        thelist.add("Javascript");
        thelist.add("HTML");
        thelist.add("CSS");
        System.out.println("Linked Hash Set : " + thelist);
        Object[] o = thelist.toArray();
        System.out.println("Array : " );
        for(int i=0; i<o.length;i++)
        {
        	System.out.println(o[i]);
        }
	}

}
