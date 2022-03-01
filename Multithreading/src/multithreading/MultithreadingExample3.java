package multithreading;

class Notes1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		
			System.out.println("Notes Thread ID is " + " "+ Thread.currentThread().getId());
		}
	}
}

class PPT2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
		}
	}
}

public class MultithreadingExample3 {

	public static void main(String[] args) {
			Notes1 p = new Notes1();
			Thread t1 = new Thread(p);
			t1.start();
			PPT2 e = new PPT2();
			Thread t = new Thread(e);
			t.start();

	}

}
