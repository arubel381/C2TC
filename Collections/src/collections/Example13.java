package collections;

import java.util.ArrayList;

public class Example13 {

	public static void main(String[] args) {
		ArrayList<String> thelist = new ArrayList<String>();
		thelist.add("abc");
		thelist.add("def");
		thelist.add("ghi");
		thelist.add("jkl");
      System.out.println(thelist);
      System.out.println(thelist.get(2));
      System.out.println(thelist.contains("def"));
      thelist.add(4,"mno");
      System.out.println(thelist.isEmpty());
      System.out.println(thelist);
      thelist.remove(4);
      System.out.println(thelist);
      System.out.println(thelist.indexOf("ghi"));
      System.out.println(thelist.lastIndexOf("jkl"));
      System.out.println(thelist.size());
      System.out.println(thelist.clone());
	}

}
