package localinner;

public class Outer {

	void f1() {
		System.out.println("Inside Outer.f1() method");
		
		class LocalInner {
			private void f2() {
				System.out.println("Inside LocalInner.f2() method");
			}
		}
		
		LocalInner localinner = new LocalInner();
		localinner.f2();
		
	}
	
}
