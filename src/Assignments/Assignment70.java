package Assignments;

public class Assignment70 {

	public static void main(String[] args) {
		subclass c1 = new subclass();
		c1.print();	
		
	}

}

class parent {
	
	void print() {
		System.out.println("Form parent Class");
	
	}
}

class subclass extends parent {
	
	void print() {
		System.out.println("Form Child Class");
		super.print();
	}
}