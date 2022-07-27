package usingarrays;

public class UsingArrays {
	
	public static void main(String[] args) {
		
		int arr1[];
		
		int[] arr2 = {10,20,30,40,50};
		
		int[] arr3 = new int[5];
		
		arr3[0] = 11;
		arr3[1] = 12;
		arr3[2] = 13;
		
		System.out.println("Print the elements of the array: ");
		System.out.println("Lenght of array:  " + arr3.length);
		
		for (int i=0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}		
		System.out.println("----------------");
		for (int element: arr3) {
			System.out.println(element);
		}
		
//		1,2,3,4,5,6,9,3,45,7,8,24,4,6,7,7,7,
		
	}

}
