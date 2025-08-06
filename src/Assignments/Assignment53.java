package Assignments;

import java.util.Scanner;

public class Assignment53 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] copy = new int[size];
		System.out.println("Enter the element");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
            copy[i] = array[i];
        }
		
		System.out.println("Original Array");
		for(int e:array) {
			System.out.print(e+" ");
		}
		
		System.out.println("Copied Array");
		for(int e:copy) {
			System.out.print(e+" ");
		}
		
		scanner.close();
	}
	

}
