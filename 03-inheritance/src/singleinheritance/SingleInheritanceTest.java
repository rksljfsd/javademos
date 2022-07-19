package singleinheritance;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		si.m1();
		System.out.println(si.getClass());
		System.out.println(si.hashCode());
		System.out.println(si.toString());
		SingleInheritance si2 = new SingleInheritance();
		System.out.println(si2.toString());
	}
	
}
