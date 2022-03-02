package lambdaexpression;

interface substraction1
{
	public int sub();
}

public class Example7 {

	public static void main(String[] args) {
		substraction1 s = () -> (20-10);
		{
			System.out.println("Substraction is " + s.sub() ); 
		};

	}

}
