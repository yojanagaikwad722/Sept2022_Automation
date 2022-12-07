package ControlStatements;

public class _NESTED_IF {

	public static void main(String[] args) {
		String UN = "quantum1";
		String PWD = "qa@123";
		
		if(UN=="quantum") {//UN - true
			System.out.println("correct username");
			
			if(PWD=="qa@123") {//password - true
				System.out.println("correct password");
				System.out.println("login successful");
			}else {//password - false
				System.out.println("wrong password");
				System.out.println("login failed");
			}
		}else {
			System.out.println("wrong username");
			System.out.println("login failed");
		}

	}
}
