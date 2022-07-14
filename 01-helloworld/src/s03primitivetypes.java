
public class s03primitivetypes {

	public static void main(String[] args) {
		
		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		System.out.println("Min byte value " + minByteValue);
		System.out.println("Max byte value " + maxByteValue);
				
		byte x = 127;
		System.out.println(x);
		
		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		System.out.println("min short: " + minShortValue);
		System.out.println("max shot: " + Short.MAX_VALUE);
		
		short y = 32767;
		
		System.out.println("min int: " + Integer.MIN_VALUE);
		System.out.println("max int: " + Integer.MAX_VALUE);
		
		System.out.println("min long: " + Long.MIN_VALUE);
		System.out.println();
		System.out.println("max long: " + Long.MAX_VALUE);
		
	}

}