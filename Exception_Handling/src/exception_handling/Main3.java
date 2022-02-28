package exception_handling;

public class Main3 {

	public static void main(String[] args) {
		String[] s= {"Hello","345","null","hi"};
		for(int i=0;i<5;i++)
		{
			try
			{
				int a = s[i].length() + Integer.parseInt(s[i]);
			}
			catch(ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException ex)
			{
				System.out.println("All Three Handles Exception Occurs");
			}
		}

	}

}
