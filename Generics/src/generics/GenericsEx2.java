package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsEx2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("X");
		list.add("Y");
		list.add(new Integer(100));
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext())
		{
			Object s = itr.next();
			if(s instanceof String)
			{
				String data = (String) s;
				System.out.println(data);
			}
			else if(s instanceof Integer)
			{
				Integer data = (Integer)s;
				System.out.println(data);
			}
			else
			{
				System.out.println(s);
			}
		}

	}

}
