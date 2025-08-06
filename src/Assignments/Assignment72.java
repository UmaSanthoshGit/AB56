package Assignments;

public class Assignment72 {

	public static void main(String[] args) {
		encapsulation e1 = new encapsulation();
		e1.setter("from_main_method@gmail.com");
		System.out.println("Email_ID is:  "+e1.getter());
		
	}

}

class encapsulation {
	
	private String email_ID = "testing@gmail.com";
	
	public void setter(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getter() {
		return email_ID;
		
	}
}
