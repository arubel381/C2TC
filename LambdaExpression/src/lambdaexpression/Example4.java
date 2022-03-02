package lambdaexpression;

interface square
{
	public void prog(int num);
}
public class Example4 {

	public static void main(String[] args) {
		square s = (int num) ->{
									System.out.println("Square of a number is " + num*num ); //using single parameter
								};
		s.prog(2);
		}

}
