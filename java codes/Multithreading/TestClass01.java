public class TestClass01 
{
	public static void main(String[] args) 
	{
	System.out.println("main starts");
		
	// 3# create object of subclass of Thread
	Foo f = new Foo();
	
	// 4## call start() method of thread on the object of subclass
	f.start();
	
	for(int i = 101; i <= 120; i++) {
		System.out.println(i);
	}

	System.out.println("main ends");
	}
}
