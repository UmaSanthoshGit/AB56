package Assignments;

public class Assignment73 {

	static int a = 10;

	public static void main(String[] args) {
		// WAP on This Keyword
		test c = new test();
		c.print(2);
	}

}

class test {
	int a = 20;

	void assign(int a) {
		this.a = a;
	}

	void print(int a) {
		System.out.println(a);
	}
}
