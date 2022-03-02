package lambdaexpression;

class eclipse implements Runnable
{
	public void run()
	{
		System.out.println("this is run method ");
	}
}

public class MultithreadingEx {

	public static void main(String[] args) {
		eclipse e = new eclipse();
		Thread t = new Thread(e);
		t.start();

	}

}
