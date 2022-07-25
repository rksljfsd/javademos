package stringcomparison;

public class StringCompareTest {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		// == only checks if 2 objects have the same memory location
		
		String s4 = new String("abc");
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		
		
	}
	
	
}
