package multithreading;

class Notes implements Runnable
{
	public void run()
	{
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getId());
	}
}

class def implements Runnable
{
	public void run()
	{
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
	}
}

public class MultithreadingExample1 {

	public static void main(String[] args) {
		Notes e = new Notes();
		Thread t = new Thread(e);
		t.start();
		def p = new def();
		Thread t1 = new Thread(p);
		t1.start();
	}

}
