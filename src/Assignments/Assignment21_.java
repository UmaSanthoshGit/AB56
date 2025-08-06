package Assignments;

import java.util.Scanner;

public class Assignment21_ {

	public static void main(String[] args) {
		
		//formula:area of a triangle:  area = 0.5 * base * height
		 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base:");
		double base = scanner.nextDouble();
		System.out.println("Enter the height:");
		double height = scanner.nextDouble();
		
		double area = 0.5 * base * height;
		System.out.println("Area of triangle: "+area);
		scanner.close();
	}

}
