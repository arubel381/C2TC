package collections2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterfaceExample2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,null);
		map.put(4,"four");
		map.put(null,"five");
		System.out.println(map);

	}

}
