package multithreading;

class counter1
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class MultithreadingExample8 {

	public static void main(String[] args)  throws Exception  {
		counter1 c = new counter1();
		Thread t1 = new Thread ( new Runnable ()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					c.increment();
				}
			}
		} );
		t1.start();
		t1.join();
		Thread t2 = new Thread ( new Runnable ()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					c.increment();
				}
			}
		} );
		t2.start();
		t2.join();
		System.out.println(c.count);

	}

}
