package multithreading;

class IDE extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getId());
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
}

public class MultithreadingExample6 {

	public static void main(String[] args) {
		IDE e = new IDE();
		e.start();

	}

}
