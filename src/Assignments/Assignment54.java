package Assignments;

import java.util.Scanner;

public class Assignment54 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int sum = 0;
		System.out.println("Enter the element");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		double average = sum / size;
		System.out.println("Average is:  " + average);
		scanner.close();
	}

}
