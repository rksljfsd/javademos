package capsule;

public class Product {

	private int id;
	private String name;
	private double cost;
	
	Product(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}
	
}
