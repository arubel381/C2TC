package generics;

import generics1.MyGenericClass;

public class GenericsEx4 {

	public static void main(String[] args) {
		
		MyGenericClass <Integer> obj = new MyGenericClass <Integer> ();
		obj.setObject(1000);
		Integer i = obj.getObject();
		System.out.println(i);
		
		MyGenericClass <String> obj1 = new MyGenericClass <String> ();
		obj1.setObject("program");
		String s = obj1.getObject();
		System.out.println(s);
		
		MyGenericClass <Double> obj2 = new MyGenericClass <Double> ();
		obj2.setObject(10.00);
		Double d = obj2.getObject();
		System.out.println(d);
		

	}

}
