package collections2;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample1 {

	public static void main(String[] args) {
		Map<Character,String> map = new HashMap<Character,String>();
		map.put('a',"Ansh");
		map.put('b',"Bablu");
		map.put('c',"Charan");
		map.put('d',"Darshan");
		map.put('c',"Chinmay");
		System.out.println(map);

	}

}
