package date_time;
import java.time.*;
public class My_Class {
	public static void main(String[] args) {
		LocalDate obj = LocalDate.now(); //date
		LocalTime obj1 = LocalTime.now(); //time
		LocalDateTime obj2 = LocalDateTime.now(); //date and time
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
