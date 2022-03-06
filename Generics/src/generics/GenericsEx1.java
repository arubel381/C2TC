package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsEx1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("X");
		list.add("Y");
		list.add(new Integer(100));
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext())
		{
			String data = itr.next();
			System.out.println(data);
		}
		

	}

}
