package exception_handling;

public class Main {

	public static void main(String[] args) {
		String[] s= {"Hello","567","null","Hi"};
		for(int i=0;i<5;i++)
		{
			try
			{
				int a=s[i].length() + Integer.parseInt(s[i]);
				System.out.println(a);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Number Format Exception Occurs");
			}
			System.out.println("counting....");
		}
	}
}
