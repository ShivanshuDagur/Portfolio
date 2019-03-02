
public class Roo extends Thread 
{
	@Override
	public void run() 
	{		
		// get object of current thread
		Thread t = Thread.currentThread();
		System.out.println("current thread is "+t);
		for(int i = 1;i <= 10; i++)
		{
			System.out.println(t.getName()+":"+i);
		}
	}
	
	public static void main(String[] args) 
	{
		// create some threads
		Roo r1 = new Roo();
		Roo r2 = new Roo();
		Roo r3 = new Roo();
		Roo r4 = new Roo();
		
		// set priority of r4
		r4.setPriority(10);
		r1.setPriority(1);
		r2.setPriority(2);
		r3.setPriority(3);
		
		// start threads
		r1.start(); r2.start(); r3.start(); r4.start();
		
		// get object of current thread
		Thread t = Thread.currentThread();
		System.out.println("main thread is "+t);

	}
}
