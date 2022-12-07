package INTERFACE;

public class ExampleImplementationClass implements interface2 {

	public void m1() {
		System.out.println("running m1 method in implementation class");
	}

	public void m2() {
		System.out.println("running m2 method in implemenatation class");
	}
	
	public static void main(String[] args) {
		ExampleImplementationClass ic = new ExampleImplementationClass();
		ic.m1();
		ic.m2();
	}

}
