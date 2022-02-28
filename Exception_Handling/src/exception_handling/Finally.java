package exception_handling;

public class Finally {

	public static void main(String[] args) {
		try
		{
			int data = 30/3;
			System.out.println(data);
		}
		catch (NumberPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block is always executed");
		}
	}

}
