package Assignments;

abstract class ONE {
	abstract void test();
	abstract void print();
	public void abstarcttest() {
		System.out.println("Inside abstarct class: concrete method");
	}
}

class TWO extends ONE {

	@Override
	void test() {
		System.out.println("Inside test method");
	}

	@Override
	void print() {
		System.out.println("Inside print method");

	}
}

public class Assignment37_38 {
	public static void main(String[] args) {
		TWO obj = new TWO();
		obj.print();
		obj.test();
		obj.abstarcttest();

	}
}
