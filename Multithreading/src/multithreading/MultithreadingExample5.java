package multithreading;

class Eclipse4 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("Eclipse Thread ID is " + " "+ Thread.currentThread().getPriority());
	}
}

class Ppt4 extends Thread
{
	public void run()
	{
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getId());
		System.out.println("PPT Thread ID is " + " "+ Thread.currentThread().getPriority());
	}
}

public class MultithreadingExample5 {

	public static void main(String[] args) {
		Eclipse4 e = new Eclipse4();
		e.start();
		e.setPriority(Thread.MAX_PRIORITY);
		Ppt4 p = new Ppt4();
		p.start();
		p.setPriority(Thread.MIN_PRIORITY);

	}

}
