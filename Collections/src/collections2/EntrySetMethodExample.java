package collections2;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethodExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10,"Ganesh");
		map.put(15,"Ramesh");
		map.put(20,"Suresh");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
