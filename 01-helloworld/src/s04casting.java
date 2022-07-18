
public class s04casting {
	
	public static void main(String[] args) {
		
		int i1 = 10;
		
		byte b1 = 12;
		
		System.out.println(i1);
		
		// converting byte to int
		i1 = b1;
		
		System.out.println(i1);
		
		i1 = 137;
		b1 = 9;
		
		System.out.println(b1);
		
		// converting int to byte
		b1 = (byte) i1;
		
		System.out.println(b1);
		
		byte xb1 = 2;
		byte xb2 = 3;
		byte result = (byte) (xb1+xb2);
		
		
		int i3 = 10;
		int i2 = 20;
		int xresult = i3+i2;
		
	}

}
