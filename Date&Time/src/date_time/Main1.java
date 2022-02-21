package date_time;

import java.time.*;

public class Main1 {

	public static void main(String[] args) {
		LocalDate d1= LocalDate.of(2021,2,21);
		System.out.println(d1.isLeapYear());
		LocalDate d2= LocalDate.of(1994,6,11);
		System.out.println(d2.isLeapYear());
		

	}

}
