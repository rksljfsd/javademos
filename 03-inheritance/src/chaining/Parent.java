package chaining;

public class Parent {
	
	int x;
	
	Parent() {
		this(25);
		System.out.println("Parent constructor: No Args" );
	}
	
	Parent(int x) {
		this.x = x;
		System.out.println("Parent Constructor: One Arg");
	}

}
