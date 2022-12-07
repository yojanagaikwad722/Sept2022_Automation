package METHOD;

public class example4 {

	// How to call non static method from same class?
	// object_name.method_name();
	// class load - compile time
	// object create - runtime
	// Object - it is an instance of class.

	 static public void main(String []args) {

		//How to create object of class?
		//class_name obj_name = new class_name();
		//new - used to create blank object
		example4 ex4 = new example4();
		ex4.addition();
		ex4.addition(10, 20, 30);
		}

	public void addition() {
		int a = 40;
		int b = 30;
		System.out.println("Addition:" + (a + b));
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
