package Polymorphism;

public class overloading {

	public static void main(String[] args) {
		overloading ex = new overloading();
		ex.division();
		ex.division(10);
		ex.division(50, 2);
	}

	public void division() {// method declaration + method definition
		int a = 50;
		int b = 5;
		System.out.println("Division:" + (a / b));
	}

	public void division(int a) {
		int b = 2;
		System.out.println("Division:" + (a / b));
	}
	
	public void division(int a, int b) {
		System.out.println("Division:" + (a / b));
	}

}
