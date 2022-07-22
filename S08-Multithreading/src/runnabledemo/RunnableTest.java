package runnabledemo;

public class RunnableTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ": Main method Begin...");
		
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);
		t.setName("CP");
		t.start();
		
		t.join();
		
		System.out.println(tName + ": Main method Ends...");
		
	}

}
