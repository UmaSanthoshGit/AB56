package Assignments;

class Parent {
    void sayHello() {
        System.out.println("Hello from the Parent class!");
    }
}

class child {
    void sayHello() {
        System.out.println("Hello from the Child1 class!");
    }
}
class child2{
	void sayHello(){
		System.out.println("Hello from the Child2 class!");	
	}
}
public class Assignment26 {
    public static void main(String[] args) {
    	child2 greet = new child2();
        greet.sayHello();
        child greet1 = new child();
        greet1.sayHello();
        Parent greet2 = new Parent();
        greet2.sayHello();
    }
}

