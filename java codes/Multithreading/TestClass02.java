
public class TestClass02 
{
	public static void main(String[] args) 
	{
	System.out.println("main start");	
	// 3# create object of class that implemented runnable nterface
	Doo d = new Doo();
	
	// 4# create object of thread class usng param cnst
	Thread t = new Thread(d);
	
	// 5# call the start() method on the object of thread
	t.start();
	
	for(int i = 101; i <= 120; i++) {
		System.out.println(i);
	}

	System.out.println("main end");
	}
}
