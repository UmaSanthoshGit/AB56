package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment59 {

	public static void main(String[] args) {

//WAP using List, iterate forward and backward and print them

		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		ListIterator<Integer> iterator = list.listIterator();

		System.out.println("Forward Direction: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("Backward Direction: ");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}
}
