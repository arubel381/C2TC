package collections2;

import java.util.HashMap;
import java.util.Map;

public class PutMethodExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(5,"abc");
		map.put(10,"def");
		map.put(15,"ghi");
		System.out.println(map);

	}

}
