package threadcomm;

public class Worker implements Runnable {

	private int total;

	public int getTotal() {
		return total;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Calculation begin");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			System.out.println(tname + ": calculation completed. notifying.");
			this.notify();
		}
		System.out.println(tname + ": Calculation end");
	}

}
