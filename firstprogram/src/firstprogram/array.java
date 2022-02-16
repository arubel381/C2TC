package firstprogram;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] a = new int [] {3,6,1,7,9,4,6};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
