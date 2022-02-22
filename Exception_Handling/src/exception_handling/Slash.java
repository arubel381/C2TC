package exception_handling;

public class Slash {
	public static void main(String[] args) {
		Slash sl = new Slash();
		try
		{
			sl.splitString();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Occurs");
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}	
	}
	public void splitString()
	{
		String s = "Happy/Coding/Java";
		String[] a = s.split("/");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Splitted String at index["+i+"]:"+a[i]);
		}
	}
}
