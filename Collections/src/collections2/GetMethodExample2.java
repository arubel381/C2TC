package collections2;

import java.util.HashMap;
import java.util.Map;

public class GetMethodExample2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name","Ansh");
		map.put("10","Student");
		map.put("Country","India");
		System.out.println(map.get("Occupation"));

	}

}
