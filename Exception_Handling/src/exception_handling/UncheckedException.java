package exception_handling;

public class UncheckedException {

	public static void main(String[] args) {
		try 
		{
			int[] arr = new int[]{5,10,15,20};
			System.out.println(arr[5]);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
