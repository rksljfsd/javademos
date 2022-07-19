package multiinheritance;

public class Child extends Parent {
	
	Child() {
		System.out.println("Child Object: " + this);
	}

	void f2() {
		System.out.println("Inside Child f2 method");
	}
	
}
