package lambdaexpression;

interface lambda
{
	public void run();
}

public class Multithreadingex1 {

	public static void main(String[] args) {
		new Thread(() -> { System.out.println("this is run method");}).start();

	}

}
