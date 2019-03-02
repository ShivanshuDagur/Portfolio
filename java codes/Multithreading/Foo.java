	// 1## inherit thread class
public class Foo extends Thread
{
	// 2## override the run() of thread class
	@Override
	public void run() 
	{
		System.out.println("run starts");
		for(int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("run ends");
	}
}
