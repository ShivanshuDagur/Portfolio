public class TestClass03 
{
	public static void main(String[] args) 
	{
	// create some threads
	Foo f1 = new Foo();
	Foo f2 = new Foo();
	
	System.out.println("f1 alive is "+f1.isAlive());
	System.out.println("f2 alive is "+f2.isAlive());
	
	f1.setName("Sita"); f2.setName("Gita");
	
	f1.setPriority(1);
	
	System.out.println("priority of f1 is "+f1.getPriority());
	System.out.println("priority of f2 is "+f2.getPriority());
		
	System.out.println("name of f1 is "+f1.getName());
	System.out.println("name of f2 is "+f2.getName());
	
	f1.start();
	f2.start();

	System.out.println("f1 alive is "+f1.isAlive());
	System.out.println("f2 alive is "+f2.isAlive());
			
	}
}
