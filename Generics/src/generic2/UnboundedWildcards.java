package generic2;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

	public static void main(String[] args) {
		List <Integer> intlist = Arrays.asList(12,60,80,30);
		printElements(intlist);
		List <Double> doublelist = Arrays.asList(10.12,110.8,13.2,12.70);
		printElements(doublelist);

	}

	private static void printElements(List<?> list) {
		for(Object element : list)
		{
			System.out.println(element);
		}
	}

}
