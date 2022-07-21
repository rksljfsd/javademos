package exceptionsdemo;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		int a, b, c, d;

		System.out.println("Enter two integers:");

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		try {
			c = a / b;
			d = a % b;
			System.out.println(a + " / " + b + " = " + c + ", Remainder = " + d);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error occurred");
		}
		System.out.println("Other Programming logic continues below...");

	}

}
