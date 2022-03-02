package lambdaexpression;

interface rectangle
{
	public void prog(int length, int width);
}

public class Example5 {

	public static void main(String[] args) {
		rectangle r = (int length, int width) ->{
			System.out.println("Area of the rectangle is " + length * width ); //using multiple parameter
		};
        r.prog(2,4);

	}

}
