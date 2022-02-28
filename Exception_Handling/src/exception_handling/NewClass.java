package exception_handling;

public class NewClass {

	public static void main(String[] args) {
		try
		{
			int[] array1 = new int[5];
			array1[7]=100/20;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exeception occurs");
		}
		System.out.println("rest of the code");
	}
}

