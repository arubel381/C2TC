package multithreading;
class abc extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		
			System.out.println("abc ID is " + " "+ Thread.currentThread().getId());
		}
	}
}

class PPT1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
		}
	}
}

public class MultithreadingExample2 {

	public static void main(String[] args) {
		abc p = new abc();
		Thread t1 = new Thread(p);
		t1.start();
		PPT1 e = new PPT1();
		Thread t = new Thread(e);
		t.start();
	}

}
