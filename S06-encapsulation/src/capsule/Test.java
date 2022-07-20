package capsule;

public class Test {

	public static void main(String[] args) {
		
		// no encapsulation
		Student student = new Student();
		student.id = 1;
		student.name = "RK";
		student.courseName = "JAVAFSD";
		student.printDetails();
		
		// writeonly object
		BankAccount acc = new BankAccount();
		acc.setAccountName("XYZ");
		acc.setAccountNumber(-2);
//		acc.setBalanceTotal(1000);
		acc.printDetails();
		
		// readonly object
		Product product = new Product(1, "Phone", 50000);
		int id = product.getId();
		System.out.println("Product Id: " + id);
		
	}
	
}
