package scannerdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student Id: ");
		int id = scanner.nextInt();
		
		System.out.println("Enter Student name: ");
		String name = scanner.next();
		
		System.out.println("Enter Student score: ");
		double score = scanner.nextDouble();
		
		System.out.println("");
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("Id    : " + id);
		System.out.println("Name  : " + name);
		System.out.println("Score : " + score);
		
	}
	
}
