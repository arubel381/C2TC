package firstprogram;

import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Number "+ n +" is positive");
		}
		else if(n<0)
		{
			System.out.println("Number "+ n +" is negative");
		}
		else
		{
			System.out.println();
		}
		sc.close();
	}
}
