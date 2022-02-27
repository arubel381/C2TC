package collections2;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodExample {

	public static void main(String[] args) {
		Map<Character,String> map = new HashMap<Character,String>();
		map.put('a',"Ansh");
		map.put('b',"Bablu");
		map.put('c',"Charan");
		map.put('d',"Darshan");
		map.remove("Bablu");
		System.out.println(map);

	}

}
