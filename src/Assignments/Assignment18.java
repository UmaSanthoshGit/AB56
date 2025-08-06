package Assignments;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		
		
		//WAP for Area of a circle with scanner.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius * radius; 
		
		// Area formula: π * r^2
		System.out.println("Area of te circle: "+area);
		
		

	}

}
