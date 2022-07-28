package collections;

import java.util.Arrays;

public class Arrayssort {
	
	public static void main(String[] args) {
		
		int[] a = {40,10,15,7, 10};
		
		System.out.print("Before sort: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int result1 = Arrays.binarySearch(a, 10);
		System.out.println("Found 10 at " + result1);
		
		Arrays.sort(a);
		
		System.out.print("After sort: ");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		int result = Arrays.binarySearch(a, 10);
		System.out.println("Found 10 at " + result);
		
	}

}
