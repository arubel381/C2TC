package lambdaexpression;

interface program2
{
	public void prog();
}

public class Example3 {

	public static void main(String[] args) {
		program2 p = () -> { 
								System.out.println("This is first program"); 
								System.out.println("This is first program"); 
								System.out.println("This is first program"); 
						   }; //using multiple statement
		p.prog();
		

	}

}
