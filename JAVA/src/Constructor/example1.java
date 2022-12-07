package Constructor;

public class example1 {

	public static void main(String[] args) {
		example1 ex1 = new example1();
		example1 ex2 = new example1(10);
		example1 ex3 = new example1(40.0f, 50.0f);
		example1 ex4 = new example1(10, 20);
		example1 ex5 = new example1(10, 20.5f);
	}
	
	example1(){//zero parameterized/without parameterized constructor
		System.out.println("calling zero parameterized/without parameterized constructor");
	}
	
	example1(int a){
		System.out.println("calling parametrized constructor");
	}
	
	example1(float f1, float f2){
		System.out.println(f1+f2);
	}
	
	example1(int f1, int f2){
		System.out.println(f1+f2);
	}
	
	example1(int f1, float f2){
		System.out.println(f1+f2);
	}
}
