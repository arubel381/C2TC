package firstprogram;

interface In1
{
	int a=10;
	static void display()
	{
		System.out.println("static Method");
	}
}
public class Mainn implements In1 {

	public static void main(String[] args) {
		In1.display();

	}

}
