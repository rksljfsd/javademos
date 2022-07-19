package superkeyword;

public class SuperTest {

	public static void main(String[] args) {
		
		Child c2 = new Child();
		c2.displayDetails();
		
		Child c1 = new Child(89, 102);
		c1.displayDetails();
		
		Child c = new Child(10, 20, 6, 9);
		c.displayDetails();
	}
	
}
