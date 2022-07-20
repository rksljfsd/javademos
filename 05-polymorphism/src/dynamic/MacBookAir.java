package dynamic;

public class MacBookAir extends MacBook{

	@Override
	void start() {
		System.out.println("Inside MacBookAir start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacBookAir shutdown()");
	}
	
}
