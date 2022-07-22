package yieldDemo;

public class YieldTest {
	
	public static void main(String[] args) {
		
		SimpleLoop sl1 = new SimpleLoop();
		Thread t1 = new Thread(sl1);
		t1.setName("t1");
		t1.start();
		
		SimpleLoop sl2 = new SimpleLoop();
		Thread t2 = new Thread(sl2);
		t2.setName("t2");
		t2.start();
		
		String tname = Thread.currentThread().getName();
		for (int i=1; i<=10; i++) {
			System.out.println(tname + ": " + i);
		}
	}

}
