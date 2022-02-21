package date_time;
import java.util.*;

public class NewClass3 {

	public static void main(String[] args) {
		Date d1 = new Date(1994-10-22);
		Date d2 = new Date(1994-06-11);
		int comparision = d1.compareTo(d2);
		int comparision1 = d2.compareTo(d1);
		int comparision2 = d1.compareTo(d1);
		System.out.println("d2>d1 : "+ comparision);
		System.out.println("d1<d2 : "+ comparision1);
		System.out.println("d1=d1 : "+ comparision2);
		boolean r1=d1.equals(d2);
		System.out.println("Results of equal() r1: "+r1);
		boolean r2=d1.equals(d1);
		System.out.println("Results of equal() r2: "+r2);
		long count1=d1.getTime();
		System.out.println("Milliseconds of r1: "+count1);
		long count2=d1.getTime();
		System.out.println("Milliseconds of r2: "+count2);
	}

}
