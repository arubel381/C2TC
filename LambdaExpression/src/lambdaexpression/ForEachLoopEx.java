package lambdaexpression;

import java.util.ArrayList;

public class ForEachLoopEx {

	public static void main(String[] args) {
		ArrayList<String> thelist = new ArrayList<String>(); 
        thelist.add("JAVA");
        thelist.add("JAVASCRIPT");
        thelist.add("HTML");
        thelist.add("CSS");
        thelist.add("C++");
        thelist.add("JAVA");
        thelist.add("PHP");
       /* for (String s : thelist)
        {
        	System.out.println(s);
        }*/
        thelist.forEach(temp -> System.out.println(temp));

	}

}
