package METHOD;

public class example2 {

	public static void main(String[] args) {
		// how to call static method from same class? - by using method name
		addition();
		addition(100, 200);
	}

	public static void addition() {// method without parameter
		int a = 20;
		int b = 40;
		System.out.println("Addition:" + (a + b));// + - concatenation operator
	}

	public static void addition(int a, int b) {// a = 100, b = 200 //method with parameters
		System.out.println("Addition:" + (a + b));
	}
}
