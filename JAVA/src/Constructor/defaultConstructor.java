package Constructor;

public class defaultConstructor {

	int i;
	boolean b;
	byte bt;
	float ft;
	String s;
	char c;
	
	public static void main(String[] args) {
		defaultConstructor d = new defaultConstructor();//default constructor called
		System.out.println(d.i);//0
		System.out.println(d.b);//false
		System.out.println(d.bt);//0
		System.out.println(d.ft);//0.0
		System.out.println(d.s);//null
		System.out.println(d.c);//single space
	}
}
