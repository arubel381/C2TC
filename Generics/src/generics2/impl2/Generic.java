package generics2.impl2;

import generics2.impl1.GClassImpl;

public class Generic {

	public static void main(String[] args) {
		GClassImpl<String> gclassimpl1 = new GClassImpl<String>();
		gclassimpl1.setValue("program");
		Object v = gclassimpl1.getValue();
		String value =(String) v;
		System.out.println(value);

	}

}
