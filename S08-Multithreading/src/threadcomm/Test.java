package threadcomm;

public class Test {

	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main Method begin");
		Worker w = new Worker();
		Thread wt = new Thread(w);
		wt.setName("WT");
		wt.start();
		synchronized (wt) {
			System.out.println(tname + ": waiting...");
			try {
				wt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname + ": notified");
			System.out.println(tname + ": Total = " + w.getTotal());
		}
		
		System.out.println(tname + ": Main Method end");
	}
	
}
