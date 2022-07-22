package interruptdemo;

public class Worker implements Runnable{
	
	boolean isAwake = true;
	
	void setAwake() {
		isAwake = true;
	}
	
	void setAsleep() {
		isAwake = false;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Start");
		
		while (!isAwake) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
		
		
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
