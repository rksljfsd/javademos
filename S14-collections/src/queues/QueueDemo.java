package queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> myq = new PriorityQueue<Integer>();
		for (int i = 10; i < 100; i = i+11) {
			myq.offer(i);
		}
		int qsize = myq.size();
		
		System.out.println(myq);
		
		
//		System.out.println(myq.poll());
//		
//		System.out.println(myq);
//		
//		System.out.println(myq.remove());
//		
//		myq.remove(87);
//		
//		System.out.println(myq);
		
//		myq.poll();
		
		for (int i = 0; i < qsize; i++) {
//			System.out.println(myq.poll());
			System.out.println(myq.remove());
		}
		
		// peek(), element()

	}
	
}
