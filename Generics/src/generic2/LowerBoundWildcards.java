package generic2;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcards {

	public static void main(String[] args) {
		List<Object> objlist = new ArrayList<Object>();
		addNumbers(objlist);
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(12);
		intlist.add(13);
		addNumbers(intlist);

	}

	private static void addNumbers(List<? super Integer> list) {
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
	}

}
