package jan7;

public class MyThread1 extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("run starts");
		for(int i = 1; i <= 40; i++)
		{
			System.out.println(i);
		}
		System.out.println("run ends");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		MyThread1 m1 = new MyThread1();
		m1.setDaemon(true);
		System.out.println("this thread is daemon "+m1.isDaemon());
		m1.start();
		System.out.println("main ends");
	}
}
