package Assignments;

class AAA1 {

	public void angle() {
		System.out.println("Inside AAA method");
	}
}

class BBB1 extends AAA1 {
	
public void test() {
		System.out.println("Inside BBB method");
	}
}

class CCC1 extends BBB1 {
	public void print() {
		System.out.println("Inside CCC method");

	}
}

public class Assignment41 {
	public static void main(String[] args) {
		CCC1 obj = new CCC1();
		obj.print();
		obj.angle();
		obj.test();
		

	}
}
