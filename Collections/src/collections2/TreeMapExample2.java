package collections2;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		SortedMap<String,String> thelist = new TreeMap<String,String>();
		thelist.put("Father","Engineer");
		thelist.put("Mother","Housewife");
		thelist.put("Son","Trainee");
		thelist.put("Daughter","CA");
		for(SortedMap.Entry m : thelist.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
