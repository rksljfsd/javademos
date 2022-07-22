package syncdemo;

public class Test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");
		
		DisplayMessage dm = new DisplayMessage();
		
		Thread t1 = new Thread(new Worker(dm, "Steve"));
		t1.setName("t1");
		
		Thread t2 = new Thread(new Worker(dm, "Max"));
		t2.setName("t2");
		
		Thread t3 = new Thread(new Worker(dm, "Smith"));
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tname + ": Main method end");
		
	}
	
}
