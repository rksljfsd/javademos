
public class s16whileloop {
	
	public static void main(String[] args) {
		int i1 = 11;
		
		while (i1 <= 10) {
			System.out.println(i1);
			i1++;
		}
		
//		do {
//			System.out.println(i);
//			i++;
//		} while(i <=10 );
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(i);
		}
		
		// 1. print numbers upto 7 using while loop
		// 2. calculate sum of numbers from 1 to 7, using while loop
		
	}

}
