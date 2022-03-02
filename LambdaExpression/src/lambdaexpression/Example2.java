package lambdaexpression;

interface program1
{
	public void prog();
}

public class Example2 {

	public static void main(String[] args) {
		program1 p = () -> { System.out.println("This is first program"); }; //using single statement
		p.prog();
		

	}

}
