package setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoStrings {

	public static void main(String[] args) {
		
		Set<String> myset = new TreeSet<>();
		myset.add("hello");
		myset.add("world");
		myset.add("is");
		myset.add("good");
		myset.add("enough");
		System.out.println(myset);
		
		Set<String> myset1 = new TreeSet<>(new StringLengthComparator());
		myset1.add("hello");
		myset1.add("world");
		myset1.add("is");
		myset1.add("good");
		myset1.add("enough");
		System.out.println(myset1);
		
	}
	
}
