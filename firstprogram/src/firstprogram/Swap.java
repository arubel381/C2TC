package firstprogram;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x & y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping: "+x+"  "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping: " +x+"  "+y);
		System.out.println();
		sc.close();
	}

}
