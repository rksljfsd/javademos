package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	static Map<String, String> users;

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Bob", 99);
		scores.put("John", 60);
		scores.put("Max", 70);
		scores.put("Tom", 65);
		scores.put("Brad", 94);
		scores.put("Lee", 80);
		
//		System.out.println(scores);
		
		users = new HashMap<String, String>();
		users.put("RK", "rk123");
		users.put("Ashok", "9873");
		users.put("Sagar", "kd73");
		System.out.println(users);
		
		System.out.println("Password for user RK = " + users.get("RK"));
		
		System.out.println("Is User Authenticated: " + authenticate("RK", "rk123"));
		System.out.println("Is User Authenticated: " + authenticate("RK", "rk1234"));
		
		Set<String> keys = users.keySet();
		System.out.println(keys);
		
		Collection<String> values = users.values();
		System.out.println(values);
		
		for (String key : keys) {
			System.out.println("Key: " + key + ", Value: " + users.get(key));
		}
		
	}
	
	static boolean authenticate(String inputUser, String inputPassword) {
		
		return users.get(inputUser).equals(inputPassword);
	}
	
}
