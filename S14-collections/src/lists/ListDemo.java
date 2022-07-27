package lists;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Hello");
		list.add(30.45);
		System.out.println(list);
		
		ArrayList<Integer> myintegerslist = new ArrayList<>();
		myintegerslist.add(10);
		myintegerslist.add(new Integer(20));
		myintegerslist.add(30);
//		myintegerslist.add("Hello");
		System.out.println(myintegerslist);
		
		ArrayList<String> mystrings = new ArrayList<>();
		mystrings.add("Hello");
		mystrings.add("how");
		mystrings.add("are");
		mystrings.add("you");
		System.out.println(mystrings);
	}
	
}
