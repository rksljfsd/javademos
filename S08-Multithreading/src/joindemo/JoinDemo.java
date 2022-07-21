package joindemo;

import java.util.Scanner;

public class JoinDemo extends Thread {

	private static int n, sum;
	
	public static void main(String[] args) {
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + JoinDemo.n + " numbers = " + JoinDemo.sum);
	}
	
	
	@Override
	public void run() {
		for (int i=1; i<JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
