package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import setdemo.StringLengthComparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		mylist.add("zebra");
		mylist.add("apple");
		mylist.add("xerox");
		mylist.add("mexico");
		mylist.add("planet");
		mylist.add("quiz");
		mylist.add("yak");
		System.out.println("Before Sort: " + mylist);
		
//		Collections.sort(mylist);
//	
//		System.out.println("After Sort: " + mylist);
//		
//		Collections.sort(mylist, new StringLengthComparator());
//		
//		System.out.println("String length sort: " + mylist);
//		
//		Collections.sort(mylist, new StringReverseComparator());
//		
//		System.out.println("String reverse sort: " + mylist);
		
		Collections.reverse(mylist);
		System.out.println("Reverse list: " + mylist);
	}
	
}
