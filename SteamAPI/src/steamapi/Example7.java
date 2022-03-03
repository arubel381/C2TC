package steamapi;

import java.util.Arrays;
import java.util.List;

public class Example7 {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(12,20,35,46,68);
		int result=0;
		for(int i : list)
		{
			if(i%5==0)
			result+=i*2;
			break;
		}
		System.out.println(result);
		System.out.println(list.stream().filter(i -> i%5==0).map(i -> i*2).findFirst());
		System.out.println(list.stream().filter(i -> i%5==0).map(i -> i*2).findFirst().orElse(0));

	}

}
