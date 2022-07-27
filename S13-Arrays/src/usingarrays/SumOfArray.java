package usingarrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {78,34,21,11,9};
		
		// calculate and print the sum of the numbers
		// in the array a
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		int sum2=0;
		for (int element : a) {
			sum2 += element;
		}
		System.out.println(sum2);
		
		int i=0;
		while (i < a.length) {
			i++;
			sum += a[i];
		}
	}
	
}
