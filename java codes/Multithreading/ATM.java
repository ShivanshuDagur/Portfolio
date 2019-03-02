package jan7;

public class ATM implements Runnable 
{
	@Override
	public synchronized  void run() 
	{
	try {
		// get the name of current thread
		String name = Thread.currentThread().getName();
		Thread.sleep(250);
		System.out.println(name+" enters inside the ATM cabin");
		Thread.sleep(250);
		System.out.println(name+" swipe his/her card");
		Thread.sleep(250);
		System.out.println(name+" provides pin");
		Thread.sleep(250);
		System.out.println(name+" widraw money");
		Thread.sleep(250);
		System.out.println(name+" completes transaction");
		Thread.sleep(250);
		System.out.println(name+" leaves ATM cabin");
		Thread.sleep(250);
		System.out.println("============================");
		Thread.sleep(250);
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}
}
