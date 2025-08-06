package Assignments;

class one {

	public void printclass1() {
		System.out.println("Class 1");
	}
}

class two extends one {

	public void printclass2() {
		System.out.println("Class 2");
	}
}

class three extends two {

	public void print() {
		System.out.println("Class 3");
	}
}

public class Assignment30 {
	
	public void test() {
		System.out.println("test ");
	}
	public static void main(String[] args) {
		
		
		
				three obj = new three();
		obj.print();
		obj.printclass1();
		obj.printclass2();
	}

}
