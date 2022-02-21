package date_time;

import java.util.*;

public class NewClass1 {

	public static void main(String[] args) {
		Date date1 = new Date(2021-02-21);
		Date date2 = new Date(1994-06-11);
		boolean a = date2.after(date1);
		System.out.println("Is date2 after date1 : " + a);
		boolean b = date1.after(date2);
		System.out.println("Is date1 after date2 : " + b);
		System.out.println("");
		Object date3 = date1.clone();
		System.out.println("Cloned Date3 : " + date3.toString());
		System.out.println("");
		boolean c = date2.before(date1);
		System.out.println("Is date2 before date1 : " + c);	

	}

}
