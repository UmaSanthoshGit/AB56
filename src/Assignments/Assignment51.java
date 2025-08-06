package Assignments;

import java.util.Scanner;

public class Assignment51 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the element");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Reversed Array");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
	

}
