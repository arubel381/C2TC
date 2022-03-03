package steamapi;

import java.util.Arrays;
import java.util.List;

public class Example8 {
	public static boolean isDivisible(int i)
	{
		System.out.println("In Divisible "+i);
		return i%5==0;
	}
	public static int mapDouble(int i)
	{
		System.out.println("In mapDouble "+i);
		return i*2;
	}
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(12,20,35,46,68);
		System.out.println(list.stream()
						   .filter(Example8 :: isDivisible)
						   .map(Example8 :: mapDouble)
						   .findAny()
						   .orElse(0));

	}

}
