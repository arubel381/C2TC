package collections2;

import java.util.Iterator;

import java.util.HashMap;
import java.util.Map;


public class KeySetMethodExample {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name","Ansh Kumar");
		map.put("Occupation","Student");
		map.put("Country","India");
		System.out.println(map.get("Name"));
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext())
		{
			String s = i.next();
			System.out.println(i + " " + map.get(s));
		}
		

	}

}
