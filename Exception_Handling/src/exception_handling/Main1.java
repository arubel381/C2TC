package exception_handling;

public class Main1 {

	public static void main(String[] args) {
		String[] s= {"Hello","567","null","Hi"};
		for(int i=0;i<5;i++)
		{
			try
			{
				int a=s[i].length() + Integer.parseInt(s[i]);
				System.out.println(a);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Number Format Exception Occurs");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out Of Bounds Exception Occurs");
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception Occurs");
			}
			System.out.println("counting....");
		}
	}
}
