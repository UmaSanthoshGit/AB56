package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment58 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> itertor = list.listIterator();
		System.out.println("Forward Direction: ");
		while(itertor.hasNext()) {
			System.out.println(itertor.next());
			
		}
		System.out.println("Backward Direction: ");
		while(itertor.hasPrevious()) {
			System.out.println(itertor.previous());
		}
	}

}
