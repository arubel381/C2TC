package collections2;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Ansh");
		map.put(2,"Bablu");
		map.put(3,"Chinmay");
		map.put(4,"Darshan");
		map.put(5,"Emily");
		System.out.println("Initial Map : " + map);
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.putAll(map);
		System.out.println(map1);

	}

}
