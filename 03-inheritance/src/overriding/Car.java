package overriding;

public class Car extends Vehicle{
	
	Car() {
		System.out.println("Car object: " + this);
	}
	
	String fuel() {
		return "Diesel";
	}

}
