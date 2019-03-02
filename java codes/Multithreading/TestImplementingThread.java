
public class TestImplementingThread {

	public static void main(String[] args) {
		ThreadImplimenting ob=new ThreadImplimenting();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		Thread t3=new Thread(ob);
		//give the names to the threads which are going to use our Atm machine
		t1.setName("Amar");
		t2.setName("Akbar");
		t3.setName("Anthony");
		//start the threads
		t1.start();
		t2.start();
		t3.start();
	}

}
