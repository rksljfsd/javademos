package threadreturn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	public static void main(String[] args) {
		
		Worker[] workers = new Worker[5];
		workers[0] = new Worker(5);
		workers[1] = new Worker(20);
		workers[2] = new Worker(30);
		workers[3] = new Worker(15);
		workers[4] = new Worker(65);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (Worker worker : workers) {
			Future<Integer> future = service.submit(worker);
			try {
				Integer total = future.get();
				System.out.println("sum of : " + worker.getNum() + " = " + total);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
