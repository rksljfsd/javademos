package gc;

public class GCDemo {

	public static void main(String[] args) {
		
		Object obj1 = new GCDemo();
		Object obj2 = new GCDemo();
		
		obj1 = null;
		obj2 = null;
		
	}
	
	GCDemo() {
		System.out.println(this + " created...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " finalized...");
	}
}
