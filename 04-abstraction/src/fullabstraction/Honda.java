package fullabstraction;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside Honda Go");
	}

	@Override
	public void stop() {
		System.out.println("Inside Honda Stop");
	}

}
