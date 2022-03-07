package generic;
import java.util.ArrayList;
import java.util.List;

import generic1.MyGenericClass;
import generics1.MyGenericClass1;
import generics1.MyGenericClass2;
public class Generic {

	public static void main(String[] args) {
		Integer intArr[]= {10,20,5,10}; 
		Long longArr[] = {10L,30L,20L,12L};
		Double doubleArr[]= {5.0,12.0,13.0,15.0,6.0};
		
		MyGenericClass<Number> mygenericclass1 = new MyGenericClass<>(intArr);
		double averageofintarr = mygenericclass1.getAverage();
		System.out.println(averageofintarr);
		System.out.println("-------------------------------------------------");
		
		MyGenericClass<Number> mygenericclass2 = new MyGenericClass<>(longArr);
		double averageoflongarr = mygenericclass2.getAverage();
		System.out.println(averageoflongarr);
		System.out.println("-------------------------------------------------");
		
		MyGenericClass<Number> mygenericclass3 = new MyGenericClass<>(doubleArr);
		double averageofdoublearr = mygenericclass3.getAverage();
		System.out.println(averageofdoublearr);
		System.out.println("-------------------------------------------------");
		
		int CountGreaterThanSpecifiedElement = CountGreaterThanSpecifiedElement(longArr,10L);
		System.out.println(CountGreaterThanSpecifiedElement);
		

	}

	private static <T extends Comparable<T>> int CountGreaterThanSpecifiedElement(T[] arr, T element) {
		int count = 0;
		for (T t :arr)
		{
			if(t.compareTo(element)>0)
			{
				count++;
			}
		}
		return count;
	}

}
