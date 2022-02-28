package exception_handling;

public class Test1 {
	class bike
	{
		public void petrol(){}
	}
	public static void main(String[] args) {
		bike b = null;
		try
		{
			b.petrol();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Occurs");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurs");
		}
		System.out.println("ends");
	}

}
