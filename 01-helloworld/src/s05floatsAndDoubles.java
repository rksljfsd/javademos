
public class s05floatsAndDoubles {

	public static void main(String[] args) {
		System.out.println("Min float value: " + Float.MIN_VALUE);
		System.out.println("Max float value: " + Float.MAX_VALUE);
		
		System.out.println("Min double value: " + Double.MIN_VALUE);
		System.out.println("Max double value: " + Double.MAX_VALUE);
		
		int val = 5;
		
		float val2 = (float) 5.25;
		
		double val3 = 5.26;
		
		val = 6;
		val2 = 6f;
		val3 = 6d;
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);
		
		int intval = 7/2;
		System.out.println(intval);
		float floatval = 7f/2f;
		System.out.println(floatval);
		
		double d = 12.5;
		float f = 12.5f;
		
		double dval = 7.0/2.0;
		System.out.println(dval);
		
		System.out.println("intval: " + intval + ", floatval: " + floatval);
	}
	
}
