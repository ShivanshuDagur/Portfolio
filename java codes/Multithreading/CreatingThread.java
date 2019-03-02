/**
 * 
 */

/**
 * @author ShivanshuDagur
 *
 */
public class CreatingThread extends Thread 
{
public void run()
{
System.out.println("abba dbba sabba...");
for(int i=0;i<10000;i++)
	System.out.println(i);

}

	public static void main(String[] args)
	{
		System.out.println("Inside main");
		for(int j=45000;j<60000;j++)
			System.out.print(j);
		CreatingThread ob=new CreatingThread();
		ob.start();
		System.out.println("Inside main");
		for(int j=45000;j<60000;j++)
			System.out.print(j);
		

	}
	

}
