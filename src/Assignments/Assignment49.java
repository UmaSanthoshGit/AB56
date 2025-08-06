package Assignments;

public class Assignment49 {
	Assignment49() {
		System.out.println("Constructor 1");
	}

	{
		System.out.println("Inistance Block Initialization-1");
	}

	{
		System.out.println("Inistance Block Initialization-2");
	}

	static {
		System.out.println("Static Block Initialization-1");

	}
	static {
		System.out.println("Static Block Initialization-2");

	}

	public static void main(String[] args) {

		Assignment49 obj = new Assignment49();

	}

}
