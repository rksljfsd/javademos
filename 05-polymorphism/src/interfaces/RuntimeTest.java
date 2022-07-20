package interfaces;

public class RuntimeTest {

	public static void main(String[] args) {
		
		// upcasting - implicit
		AppleLaptop al = new MacBookAir();
		al.start();
		al.shutdown();
		
		MacBook macb = new MacBookAir();
		// downcasting - explicit
		MacBookAir obj = (MacBookAir) macb;
		
		MacBook pro = new MacBookPro();
		MacBookPro obj2 = (MacBookPro) pro;
		obj2.prosmethod();
		
	}
	
	
	
}
