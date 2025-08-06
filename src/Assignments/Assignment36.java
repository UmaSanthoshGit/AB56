package Assignments;

class finalone {
	final int a = 100; // variable cannot be modified

	public final void print() { // method cannot be overeridden
		System.out.println("Inside AAA method");
	}

	public void test() {
		System.out.println("Inside test");
	}

}

final class finaltwo extends finalone { // final class cannot be inherited
	
	public void test() {
		System.out.println(a);
		int a =200;
		System.out.println(a);
	}
}

public class Assignment36 {
	public static void main(String[] args) {
		finaltwo obj = new finaltwo();
		obj.test();
		obj.print();
	}
}
