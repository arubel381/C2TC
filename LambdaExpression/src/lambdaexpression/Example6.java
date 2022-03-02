package lambdaexpression;

interface substraction
{
	public int sub(int a, int b);
}

public class Example6 {

	public static void main(String[] args) {
		substraction s = (int a, int b) -> (a-b);
		{
			System.out.println("Substraction is " + s.sub(20, 10) ); 
		};
	}

}
