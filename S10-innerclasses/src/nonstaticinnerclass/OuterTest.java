package nonstaticinnerclass;

import nonstaticinnerclass.Outer.Inner;

public class OuterTest {

	public static void main(String[] args) {
		Outer outer = new Outer(80);
		outer.f1();
		
		Outer.Inner inner = outer.new Inner(30);
		inner.f2();
		
	}
}
