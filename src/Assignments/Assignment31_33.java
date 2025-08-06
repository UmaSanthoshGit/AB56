package Assignments;

class AB {
	AB() {
		System.out.println("Inside AB: non param con");
	}

	AB(int a) {
		System.out.println("Inside AB: parametrerized constructor");
	}
}
class BD extends AB {
	BD() {
		this(0);
		System.out.println("Inside BD constructor");
	}

	BD(String s) {
		super(20);

		System.out.println("Inside BD: string para cons");
	}
BD(int a) {
		this("Abc");
		System.out.println("Inside BD: Paramenter Constructor");
	}
}
public class Assignment31_33 {
	public static void main(String[] args) {
BD obj = new BD();

	}

}
