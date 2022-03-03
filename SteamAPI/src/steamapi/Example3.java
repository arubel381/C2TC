package steamapi;

import java.util.Arrays;
import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
		//Normal Approach
		int result=0;
		for(int i : list)
		{
			result+=i*2;
		}
		System.out.println(result);
		
		//Stream concept approach
		System.out.println(list.stream().map(i -> i*2).reduce(0,(c,e) -> (c+e)));
		System.out.println(list.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c,e)));
		System.out.println(list.stream().map(i -> i*2).reduce(0,Integer::sum));
	}

}
