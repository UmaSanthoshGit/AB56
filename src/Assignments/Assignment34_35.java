package Assignments;

class AAA {
	int a = 100;
	
	public void print() {
		System.out.println("Inside AAA method");
		System.out.println(a);
	}
}
class BBB extends AAA {
	int a =200;
	public void print() {
		super.print(); // Super keyword - Method
		System.out.println("Inside BBB method");
		System.out.println(super.a);  // Super keyword - Variable
	}
	}
class CCC extends BBB{
	public void print() {
		System.out.println("Inside CCC method");

	}
}
public class Assignment34_35 {
	public static void main(String[] args) {
		CCC obj = new CCC();
		obj.print();
		BBB obj2= new BBB();
		obj2.print();

	}
}
