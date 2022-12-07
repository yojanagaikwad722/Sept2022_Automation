package ControlStatements;

public class _IF {

	public static void main(String[] args) {
		int marks = 0;
		
		/*if(marks>=65) {//true
			System.out.println("Distinction");
		}*/
		
		/*if(marks<35) {//fail
			System.out.println("Fail");
		}*/
		
		// && - AND operator
		// || - OR operator
		// != - not equals to
		// == - equals to
		// = - assignment operator
		// >= - greater than equals to
		// <= - less than equals to
		
		if(marks >= 35 && marks <=100 && marks != 0) {//true
			System.out.println("Pass");
		}
		
	}
}
