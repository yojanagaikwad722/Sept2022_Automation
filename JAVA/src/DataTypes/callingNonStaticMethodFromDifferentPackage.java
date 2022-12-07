package DataTypes;

import METHOD.example4;

public class callingNonStaticMethodFromDifferentPackage {

	//calling non-static method from different package
	public static void main(String[] args) {
		example4 ex4 = new example4();
		ex4.addition();
		ex4.addition(500, 500, 450);
		
	}
}
