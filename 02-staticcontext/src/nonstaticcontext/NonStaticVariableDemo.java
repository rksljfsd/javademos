package nonstaticcontext;

public class NonStaticVariableDemo {
	
	static int y = 10;
	
	// non-static variable
	// instance variable
	int num;
	
	static {
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	NonStaticVariableDemo(int x) {
		System.out.println("Inside the constructor");
		this.num = x;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		
		NonStaticVariableDemo nsvd1 = new NonStaticVariableDemo(20);
		nsvd1.num = 7;
		
		NonStaticVariableDemo nsvd2 = new NonStaticVariableDemo(21);
		NonStaticVariableDemo nsvd3 = new NonStaticVariableDemo(22);
		
		System.out.println(nsvd1.num);
		System.out.println(nsvd1.y);
		
		System.out.println(nsvd2.num);
		System.out.println(nsvd2.y);
		
		System.out.println(nsvd3.num);
		System.out.println(nsvd3.y);
	}

}
