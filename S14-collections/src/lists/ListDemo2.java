package lists;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i += 10) {
			list.add(i);
		}
		System.out.println(list);
		
		list.add(7);
		System.out.println(list);
		
		list.add(2, 9);
		System.out.println(list);
		
		list.set(6,  500);
		System.out.println(list);

	}

}
