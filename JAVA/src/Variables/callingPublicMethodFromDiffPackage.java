package Variables;

import TypesOfAccessSpecifiers.example;

public class callingPublicMethodFromDiffPackage extends example {

	public static void main(String[] args) {
		example ex1 = new example();
		ex1.m1();
		//ex1.m2(); private - not visible outside the class
		//ex1.m3(); default
		
		callingPublicMethodFromDiffPackage c = new callingPublicMethodFromDiffPackage();
		c.m4();//protected
	}
}
