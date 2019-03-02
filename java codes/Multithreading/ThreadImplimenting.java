
public class ThreadImplimenting implements Runnable
{
public synchronized void run()
{
	try
	{
    String name=Thread.currentThread().getName();
    System.out.println("Welcome to ATM"+name);
	System.out.println(name+"Enter the Atm");
	System.out.println(name+"swipes the card");
	System.out.println(name+"withdraws the money");
	System.out.println(name+"Leaves the Atm");
	System.out.println("============================");
	}
catch(Exception e)
	{e.printStackTrace();}
}

}
