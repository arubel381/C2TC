package steamapi;

import java.util.Arrays;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,5,4,3);
		list.forEach(System.out :: print);
		
		list.stream().limit(4).forEach(System.out :: println);
	}

}
