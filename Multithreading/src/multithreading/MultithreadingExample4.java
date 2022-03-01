package multithreading;

class Eclipse3 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getPriority());
	}
}

class Ppt3 extends Thread
{
	public void run()
	{
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getPriority());
	}
}

public class MultithreadingExample4 {

	public static void main(String[] args) {
		Eclipse3 e = new Eclipse3();
		e.start();
		e.setPriority(8);
		Ppt3 p = new Ppt3();
		p.start();
		p.setPriority(4);

	}

}
