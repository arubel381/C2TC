package exception_handling;
public class CheckedException {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try
		{
			int[] myintarray = new int[]{1,2,3};
			print(myintarray);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesn't have fourth elements");
		}
		System.out.println("Third Line");
	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
	}
}
