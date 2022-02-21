package date_time;
import java.util.*;

public class NewClass {

	public static void main(String[] args) 
	{
		Date mydate = new Date();
		System.out.println("System Date: "+ mydate.toString());
		mydate.setTime(66666);
		System.out.println("Time after Settings: "+ mydate.toString());
		int d = mydate.hashCode();
		System.out.println("Amount (in ms) by which time "+" is shifted: " + d);
	}

}
