package TypesOfVariables;

public class example1 {

	int a = 20;//global variables
	static int b = 30;
		
	public static void main(String[] args) {
		example1 ex1 = new example1();
		System.out.println(ex1.a);//20
		System.out.println(b);
		System.out.println(example1.b);
	}
	
	public void addition() {
		int a = 10;//local variables
		int b = 20;
		System.out.println("Addition:"+(a+b));
	}

}
