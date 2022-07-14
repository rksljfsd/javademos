
public class s08StringMethods {

	public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(s);
		System.out.println("Length = " + s.length());
		
		System.out.println("Index of W = " + s.indexOf('W'));
		
		// print the character at position 3
		System.out.println("Character at 3 = " + s.charAt(3));
//		System.out.println("Character at 12 = " + s.charAt(12));
		
		System.out.println("Command after exception");
		
		System.out.println("Index of l = " + s.indexOf('l'));
		System.out.println("Index of second l = " + s.indexOf('l',3));
		System.out.println("Index of third l = " + s.indexOf('l',4));
		
		System.out.println("substring: " + s.substring(3));
		System.out.println("only lowo: " + s.substring(3, 8));	
		
		String[] s2 = s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		String[] s3 = s.split("o");
		System.out.println("no of derived words: " + s3.length);
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		System.out.println("index of space: " + s.indexOf(" "));
		
		System.out.println("Replaced: " + s.replace("l", "j"));
		
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Lowercase: " + s.toLowerCase());
		
	}
	
}
