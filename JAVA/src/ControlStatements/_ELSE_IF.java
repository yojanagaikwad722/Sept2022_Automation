package ControlStatements;

public class _ELSE_IF {

	public static void main(String[] args) {
		int marks = 20;
		
		if(marks>=65) {
			System.out.println("Distinction");
		}else if(marks>=60) {
			System.out.println("First class");
		}else if(marks>=50){
			System.out.println("second class");
		}else if(marks>=35) {
			System.out.println("pass");
		}else {//false
			System.out.println("fail");
		}
	}
}
