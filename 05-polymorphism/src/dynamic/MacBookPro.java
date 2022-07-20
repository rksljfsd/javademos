package dynamic;

public class MacBookPro extends MacBook {

	@Override
	void start() {
		System.out.println("Inside MacbookPro start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacbookPro shutdown()");
	}
	
}
