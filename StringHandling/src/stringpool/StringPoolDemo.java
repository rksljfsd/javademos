package stringpool;

public class StringPoolDemo {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Jonathan");
		User user2 = new User(2, "Jonathan");
		
		System.out.println(user1);
		System.out.println(user2);
		
		String s1 = "Max";
		String s2 = "Max";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	
}
