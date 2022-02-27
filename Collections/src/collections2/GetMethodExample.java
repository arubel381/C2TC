package collections2;

import java.util.HashMap;
import java.util.Map;

public class GetMethodExample {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name","Ansh");
		map.put("Occupation","Student");
		map.put("Country","India");
		System.out.println(map.get("Name"));

	}

}
