package METHOD;

public class example5 {

	//calling non-static method from different class
	public static void main(String[] args) {
		example4 ex4 = new example4();
		ex4.addition();
		ex4.addition(40, 50, 60);
	}
}
