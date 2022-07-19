package fullabstraction;

public class Honda implements Car {
	
	final int numWheels = 4;

	@Override
	public void go() {
		System.out.println("Inside Honda Go");
	}

	@Override
	public void stop() {
		System.out.println("Inside Honda Stop");
	}
	
	public void modifyCar() {
//		numWheels = 5;
	}

}
