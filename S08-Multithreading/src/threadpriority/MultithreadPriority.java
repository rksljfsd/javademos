package threadpriority;

import javax.management.MXBean;

public class MultithreadPriority extends Thread{
	
	public static void main(String[] args) {
		
		MultithreadPriority mt1 = new MultithreadPriority();
		mt1.setName("mt1");
		mt1.setPriority(MIN_PRIORITY);
		mt1.start();
		
		MultithreadPriority mt2 = new MultithreadPriority();
		mt2.setName("mt2");
		mt2.setPriority(MAX_PRIORITY);
		mt2.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
