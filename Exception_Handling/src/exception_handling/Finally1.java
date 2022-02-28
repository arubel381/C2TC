package exception_handling;

public class Finally1 {

	public static void main(String[] args) {
		try
		{
			int data = 30/0;
			System.out.println(data);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Number should not be divided by zero");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Out of Try-catch-finally block");
	}
}
