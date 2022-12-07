package INTERFACE;

public class ImplementationClass implements I1, I2 {// multiple inheritance's functionality

	public static void main(String[] args) {
		ImplementationClass ic = new ImplementationClass();
		ic.addition();
		ic.division();
		ic.subtraction();
		ic.multiplication();
	}

	public void division() {
		int a = 50;
		int b = 5;
		System.out.println("Division:" + (a / b));
	}

	public void multiplication() {
		int a = 50;
		int b = 5;
		System.out.println("Multiplication:" + (a * b));
	}

	public void addition() {
		int a = 50;
		int b = 5;
		System.out.println("Addition:" + (a + b));
	}

	public void subtraction() {
		int a = 50;
		int b = 5;
		System.out.println("Subtraction:" + (a - b));
	}

}
