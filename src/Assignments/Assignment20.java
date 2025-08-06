package Assignments;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		
		//formula:area of a square:  A2 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the area:");
		double length = scanner.nextDouble();
		
		double area = length*length;
		System.out.println("Area of square: "+area);
		scanner.close();
	}

}
