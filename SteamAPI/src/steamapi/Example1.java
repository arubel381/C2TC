package steamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
		for(int i=0;i<6;i++)
		{
			System.out.println(list.get(i));
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Integer i : list)
		{
			System.out.println(i);
		}
		
		list.forEach(values -> System.out.println(values));

	}

}
