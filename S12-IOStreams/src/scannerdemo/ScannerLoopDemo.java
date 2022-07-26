package scannerdemo;

import java.util.Scanner;

public class ScannerLoopDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			sum += num;
			System.out.println("Enter a number: ");
		}
		
		System.out.println("Sum = " + sum);
		
	}
	
}
