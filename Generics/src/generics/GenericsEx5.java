package generics;

import generics1.MyGenericClass1;
import generics1.MyGenericClass2;
import java.util.ArrayList;
import java.util.List;

public class GenericsEx5 {

	public static void main(String[] args) {
		MyGenericClass1<Integer> mygenericclass1 = new MyGenericClass1<>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(101);
		list.add(102);
		mygenericclass1.setList(list);
		
		List<Integer> list1 = mygenericclass1.getList();
		list1.forEach(System.out :: println);
		System.out.println("-------------------------------------------------");
		
		MyGenericClass1<String> mygenericclass2 = new MyGenericClass1<>();
		List<String> list2 = new ArrayList<String>();
		list2.add("AA");
		list2.add("BB");
		list2.add("CC");
		mygenericclass2.setList(list2);
		mygenericclass2.getList().forEach(System.out :: println);
		System.out.println("-------------------------------------------------");
		
		MyGenericClass2<Integer,String> mygenericclass22 = new MyGenericClass2<Integer,String>(1001,"KKK");
		System.out.println(mygenericclass22.getKey()+"\t"+mygenericclass22.getValue());
		
		MyGenericClass2<String,Integer> mygenericclass33 = new MyGenericClass2<String,Integer>("KKKK",1002);
		System.out.println(mygenericclass33.getKey()+"\t"+mygenericclass33.getValue());
		

	}

}
