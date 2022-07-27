package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Object[] objects = new Object[1000000];
		for (int i=0; i<objects.length; i++) {
			objects[i] = new Object();
		}
		
		List<Object> linklist = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			linklist.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken for adding to linkedlist: " + (end - start) + " ms ");
		
		List<Object> arrlist = new ArrayList<>();
		start = System.currentTimeMillis();
		for (Object object : objects) {
			arrlist.add(object);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding to Arraylist: " + (end - start) + " ms ");
	}
	
}
