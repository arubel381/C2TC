package steamapi;

import java.util.Arrays;
import java.util.List;

public class Example2 {
	public static void doubleit(int i)
	{
		System.out.println(i*2);
	}
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(System.out :: println);
		System.out.println();
		list.forEach(i -> doubleit(i));
		System.out.println();
		list.forEach(Example2 :: doubleit);
		System.out.println();
	}

}
