package nonstaticinnerclass;

public class Outer {
	
	private static int x = 50;
	
	private int y;
	
	Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer class Non-Static Method: Outer.f1()");
	}
	
	class Inner {
		private int y;
		Inner(int y) {
			this.y = y;
		}
		void f2() {
			System.out.println("Outer class x: " + Outer.x);
			System.out.println("Outer class y: " + Outer.this.y);
			System.out.println("Inner class y: " + this.y);
		}
	}

}
