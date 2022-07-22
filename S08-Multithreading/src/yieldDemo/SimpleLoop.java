package yieldDemo;

public class SimpleLoop implements Runnable {

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for (int i=1; i<=10; i++) {
			Thread.yield();
			System.out.println(tname + ": " + i);
		}
	}

}
