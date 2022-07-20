package interfaces;

public class MacBookAir extends MacBook{

	@Override
	public void start() {
		System.out.println("Inside MacBookAir start()");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookAir shutdown()");
	}
	
}
