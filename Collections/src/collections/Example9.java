package collections;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<String> thelist = new ArrayList<String>(); // indexOf() & lastIndexOf() method
        thelist.add("JAVA");
        thelist.add("JAVASCRIPT");
        thelist.add("HTML");
        thelist.add("CSS");
        thelist.add("C++");
        thelist.add("JAVA");
        thelist.add("PHP");
        System.out.println("ArrayList" + thelist);   
        System.out.println("Value of indexOf() method is " + thelist.indexOf("JAVA"));     
	    System.out.println("Value of IastIndexOf() method is " + thelist.lastIndexOf("JAVA"));    
	}
}
