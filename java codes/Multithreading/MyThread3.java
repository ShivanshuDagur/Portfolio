package jan7;

public class MyThread3 extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("run starts");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		System.out.println("run ends");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		
		MyThread3 m = new MyThread3();
		m.start();
		
		for(int i = 10; i <= 100; i = i + 10)
		{
			if(i >= 50) {
			try {
				Thread.sleep(999L, 999999 + 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}

			System.out.println(i);
		}
		System.out.println("main ends");
	}
}
