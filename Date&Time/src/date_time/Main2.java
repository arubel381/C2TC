package date_time;

import java.time.*;

public class Main2 {

	public static void main(String[] args) {
		LocalTime t1= LocalTime.of(20,23,22);
		System.out.println(t1);
		LocalTime t2= t1.minusHours(2);
		LocalTime t3= t2.minusMinutes(4);
		LocalTime t4= t3.minusSeconds(4);
		System.out.println("Minus Hours , Minutes & Seconds : " + t4);
		LocalTime t5= t4.plusHours(4);
		LocalTime t6= t5.plusMinutes(16);
		LocalTime t7= t6.plusSeconds(4);
		System.out.println("Plus Hours , Minutes & Seconds : "+ t7);

	}

}
