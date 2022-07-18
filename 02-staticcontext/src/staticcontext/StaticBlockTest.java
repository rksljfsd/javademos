package staticcontext;

public class StaticBlockTest {
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println("Inside Main Method");
		x = 11;
		System.out.println("Run a query from DB");
	}
	
	
	static {
		int x = 10;
		System.out.println("Static block 2");
		System.out.println("Create connection to system 1");
	}

	static {
		System.out.println("Static block 1");
	}
}
