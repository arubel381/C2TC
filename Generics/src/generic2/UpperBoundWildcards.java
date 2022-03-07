package generic2;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcards {

	public static void main(String[] args) {
		List <Integer> intlist = Arrays.asList(5,20,30);
		System.out.println("sum="+ sumOfElements(intlist));
		List <Double> doublelist = Arrays.asList(50.0,200.0,300.0);
		System.out.println("sum="+ sumOfElements(doublelist));
	}

	private static double sumOfElements(List<? extends Number> list) {
		double sum = 0.0;
		for(Number num : list)
		{
			sum += num.doubleValue();
		}
		return sum;
	}

}
