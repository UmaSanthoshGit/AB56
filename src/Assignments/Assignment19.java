package Assignments;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		
		//formula: length * width; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter te lengt of rectangle:");
		double length = scanner.nextDouble();
		System.out.println("Enter te width of rectangle:");
		double width = scanner.nextDouble();
		
		double area = length*width;
		System.out.println("Area of rectangle: "+area);
		scanner.close();
	}

}
