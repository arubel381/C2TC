package exception_handling;

public class MyClass {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
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
		catch(NullPointerException nullExp)
		{
			System.out.println("We have an exception :" +nullExp);
		}
		System.out.println("Outside try catch block");
	}
}
