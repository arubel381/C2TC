package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsEx3 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
		//list.add(new Integer(100));
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext())
		{
			String data = itr.next();
			System.out.println(data);
		}
	}

}
