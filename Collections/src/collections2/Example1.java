package collections2;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		Map<String,Double> Car = new HashMap<String,Double>();
		Car.put("Maurti",10.00);
		Car.put("Innova",20.00);
		Car.put("Volkswagon",30.00);
		System.out.println(Car.keySet());
		System.out.println(Car.entrySet());
	}

}
