package exception_handling;

public class Test {

	public static void main(String[] args) {
		try
		{
			int i;
			return;
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
