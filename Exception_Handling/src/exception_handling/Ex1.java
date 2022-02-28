package exception_handling;

public class Ex1 {

	public static void main(String[] args) {
		try
		{
			String array[] = new String[10];
			array = null;
			array[0]="one";
			System.out.println(array[0]);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
	}

}
