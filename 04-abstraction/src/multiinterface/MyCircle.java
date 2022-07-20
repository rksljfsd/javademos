package multiinterface;

public class MyCircle implements Circle, CircleTwo{

	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
	}

	@Override
	public void calculateArea(int radius) {
				
	}

}
