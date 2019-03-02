package jan7;

public class TestATM 
{
	public static void main(String[] args) 
	{
	// create object of ATM
	ATM atm = new ATM();
	
	// create 3 threads
	Thread t1 = new Thread(atm);
	Thread t2 = new Thread(atm);
	Thread t3 = new Thread(atm);
	
	// set name for threads
	t1.setName("Ganga"); t2.setName("Jamuna"); t3.setName("Saraswati");
	
	// start threads
	t1.start(); t2.start(); t3.start();
	}
}
