package superkeyword;

public class Child extends Parent{

	int c, d;
	
	Child() {
		
	}
	
	Child (int x, int y) {
		super(-1, -1);
		this.c = x;
		this.d = y;
	}
	
	Child (int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}
	
	void displayDetails() {
		System.out.println("Parent a = " + a);
		System.out.println("Parent b = " + b);
		System.out.println("Child  c = " + c);
		System.out.println("Child  d = " + d);
	}
	
}
