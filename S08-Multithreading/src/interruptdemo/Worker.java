package interruptdemo;

public class Worker implements Runnable{

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Start");
		for (int i=1; i<=10; i++) {
			System.out.println(tname + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(tname + ": Interrupted");
				break;
			}
		}
		System.out.println(tname + ": End");
	}

}
