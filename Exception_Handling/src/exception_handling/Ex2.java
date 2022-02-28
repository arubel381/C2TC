package exception_handling;

public class Ex2 {

	public static void main(String[] args) {
		float pi = new float(3.14f);
		if(pi>3)
		{
			System.out.println("pi is bigger than 3");
		}
		else
		{
			System.out.println("pi is not bigger than 3");
		}
		finally
		{
			System.out.println("ends");
		}

	}

}
