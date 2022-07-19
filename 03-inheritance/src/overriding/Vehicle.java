package overriding;

public class Vehicle {
	
	Vehicle() {
		System.out.println("Vehicle object: " + this);
	}

	String fuel() {
		return "Petrol";
	}
	
}
