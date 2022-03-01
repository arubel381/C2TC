package multithreading;

class eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getName());
	}
}

class ppt extends Thread
{
	public void run()
	{
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getName());
	}
}

public class MultithreadingExample {

	public static void main(String[] args) {
		eclipse e = new eclipse();
		e.start();
		ppt p = new ppt();
		p.start();

	}

}
