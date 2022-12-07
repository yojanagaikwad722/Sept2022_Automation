package AbstractClassAndConcreteClass;

public class example2 extends example1 {//concrete class
	
	public static void main(String[] args) {
		example2 ex2 =new example2();
		ex2.test1();
		ex2.test2();
	}
	
	public void test2() {
		System.out.println("implementing abstract method in concrete class");	
	}

}
