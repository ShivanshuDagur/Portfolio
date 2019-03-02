// 1# define a class that implements runnable interface 
public class Doo implements Runnable 
{
	// 2# override the run() method of runnable interface
	@Override
	public void run() 
	{
		System.out.println("Doo.run starts");
		for(int i = 1; i <= 20; i++) {
			System.out.println("Doo.run says i is "+i);
		}
		System.out.println("Doo.run ends");
	}	

}
