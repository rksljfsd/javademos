package setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> myset = new HashSet<>();
		myset.add(10);
		myset.add(20);
		myset.add(30);
		myset.add(40);
		myset.add(20);
		System.out.println(myset);
		
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Integer randomNumber = random.nextInt(5);
			list.add(randomNumber);
		}
		System.out.println("List with duplicate numbers: " + list);
		
		Set<Integer> newset = new HashSet<Integer>(list);
		System.out.println("Set created from the list: " + newset);
	}
	
}
