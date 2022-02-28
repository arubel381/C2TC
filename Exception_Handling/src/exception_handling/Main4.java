package exception_handling;

import java.util.*;

public class Main4 {

	public static void main(String[] args) {
			try
			{
				int a= Integer.parseInt("abc");
			}
			catch(Exception e)
			{
				System.out.println("");
			}
			catch(NumberFormatException e)
			{
				System.out.println("");
			}
	}
}