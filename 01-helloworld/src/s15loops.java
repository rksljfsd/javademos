
public class s15loops {

	public static void main(String[] args) {

//		System.out.println("Manufacturing toys - 1");
//		System.out.println("Manufacturing toys - 2");
//		System.out.println("Manufacturing toys - 3");
//		System.out.println("Manufacturing toys - 4");
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("manufacturing toys: " + i);
//		}
//
//		for (int i = 10; i> 0; i--) {
//			System.out.println("Value of i = " + i);
//		}
//		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(i);
		}

		// print all even numbers between 22 to 98
//
//		for (int i = 22; i <= 98; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

//		for (int i = 22; i <= 98; i += 2) {
//			System.out.println(i);
//		}

		// find the sum of all numbers divided by 3 and 5 between 1 to 100
		// sum only the first 5 numbers that satisfies the above criteria
		
//		int sum = 0;
//		int count = 0;
//		for (int i = 1; i< 100; i++) {
//			if ( (i % 3 == 0) && (i % 5 ==0)) {
//				sum += i;
//				count++;
//			}
//			if (count == 5) {
//				break;
//			} else {
//				continue;
//			}
//		}
//		System.out.println("sum = " + sum);
//		System.out.println("total numbers that satisfies the criteria = " + count);
	}

}
