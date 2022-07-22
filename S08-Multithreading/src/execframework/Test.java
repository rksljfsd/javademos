package execframework;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");
		
		CheckProcessorTask[] cpts = new CheckProcessorTask[4];
		cpts[0] = new CheckProcessorTask("ATM");
		cpts[1] = new CheckProcessorTask("Bank");
		cpts[2] = new CheckProcessorTask("Web");
		cpts[3] = new CheckProcessorTask("Mobile");
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
		for (CheckProcessorTask x : cpts) {
			fixedThreadPool.submit(x);
		}
//		for (int i=0; i<cpts.length; i++) {
//			fixedThreadPool.submit(cpts[i]);
//		}
		
		fixedThreadPool.shutdown();
		
		System.out.println(tname + ": Main method end");
		
	}
	
}
