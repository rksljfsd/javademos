package multi;

public class MultiThread extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		MultiThread mt = new MultiThread();
		mt.start();
		
		for (int j=1; j<=200; j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(500);
		}
	}

	@Override
	public void run() {
		for (int i=1; i<=200; i++) {
			System.out.println("i: " + i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
