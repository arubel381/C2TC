package exception_handling;

public class MyClass1 {

	public static void main(String[] args) {
		MyClass1 ob = new MyClass1();
		try
		{
			ob.method1();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arthmetic Exception thrown by method 1 method is caught in main() method");
		}	
	}
	public void method1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println("We have an exception :" +e);
		}
		System.out.println("Outside try catch block");
	}
}
