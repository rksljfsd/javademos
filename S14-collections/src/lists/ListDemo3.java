package lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 12) {
			list.add(i);
		}
		System.out.println("First List  : " + list);
		
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second List : " + secondList);
		
//		list.addAll(4, secondList);
//		System.out.println("After adding second list to first list: " + list);

		secondList.addAll(list);
		System.out.println(secondList);
		

	}

}
