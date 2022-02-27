package collections2;

import java.util.HashMap;

public class Example2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Ansh");
		map.put(2,"Bablu");
		map.put(3,"Chinmay");
		map.put(4,"Darshan");
		map.put(5,"Emily");
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(20));
		System.out.println(map.containsValue("Bablu"));
		System.out.println(map.containsValue("Ganesh"));
	}

}
