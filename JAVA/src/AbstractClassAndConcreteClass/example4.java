package AbstractClassAndConcreteClass;

public class example4 extends example3 {// concrete class

	public static void main(String[] args) {
		example4 ex4 = new example4();
		ex4.addition();
		ex4.subtraction();
	}

	public void addition() {
		int a = 50;
		int b = 90;
		System.out.println("Addition:" + (a + b));

	}

	public void subtraction() {

		int a = 100;
		int b = 90;
		System.out.println("Subtraction:" + (a - b));
	}
}
