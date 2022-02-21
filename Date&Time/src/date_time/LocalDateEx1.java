package date_time;

import java.time.LocalDate;

public class LocalDateEx1 {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		LocalDate yesterday= date.minusDays(1);
		LocalDate tommorow= yesterday.plusDays(2);
		System.out.println("Today Date : " + date);
		System.out.println("Yesterday Date : " + yesterday);
		System.out.println("Tommorow Date : " + tommorow);
		

	}

}
