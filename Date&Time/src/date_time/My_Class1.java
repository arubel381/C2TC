package date_time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class My_Class1 {

	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("before formatting : " + obj);
		DateTimeFormatter abc = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss"); // to display date in day-month-year format and time in hours:minutes:seconds format
		DateTimeFormatter abc1 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"); // to display date in day/month/year format and time in hours:minutes:seconds format
		DateTimeFormatter abc2 = DateTimeFormatter.ofPattern("E,MMM dd YYYY HH:mm:ss"); //to display week name, month name , date , year & time
		String dateformatted = obj.format(abc);
		String dateformatted1 = obj.format(abc1);
		String dateformatted2 = obj.format(abc2);
		System.out.println("after formatting : " + dateformatted);
		System.out.println("after formatting : " + dateformatted1);
		System.out.println("after formatting : " + dateformatted2);
	}

}
