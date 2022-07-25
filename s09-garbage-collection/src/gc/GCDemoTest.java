package gc;

public class GCDemoTest{

	public static void main(String[] args) {
		
		// creating object WITHOUT any reference
		new Employee(1);
		new Employee(2);
		
		// creating objects WITH reference
		Object obj1 = new Employee(3);
		Object obj2 = new Employee(4);
		
		System.gc();
		
		
	}
	
	
}
