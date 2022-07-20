package dynamic;

public class RuntimeTest {

	public static void main(String[] args) {
		
		MacBookPro pro = new MacBookPro();
		pro.start();
//		operateMac(pro);
		
		MacBookAir air = new MacBookAir();
//		operateMac(air);
		
		MacBook obj = new MacBookPro();
		obj.start();
		obj.shutdown();
		
		(new RuntimeTest()).operateMac(air);
		
	}
	
	void operateMac(MacBook mac) {
		mac.start();
		mac.shutdown();
	}
	
}
