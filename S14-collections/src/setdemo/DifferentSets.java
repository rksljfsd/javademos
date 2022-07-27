package setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> myset = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			Integer randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
			myset.add(randomNumber);
		}
		System.out.println("HashSet elements: " + myset);
		
		myset = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			Integer randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
			myset.add(randomNumber);
		}
		System.out.println("LinkedHashSet elements: " + myset);
		
		myset = new TreeSet<>();
		for (int i = 0; i < 5; i++) {
			Integer randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
			myset.add(randomNumber);
		}
		System.out.println("Treeset elements: " + myset);
		
		Set<String> names = new TreeSet<>();
		names.add("xyz");
		names.add("abc");
		names.add("def");
		System.out.println("Treeset names: " + names);
		
	}
	
}
