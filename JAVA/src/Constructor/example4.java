package Constructor;

public class example4 {

	public static void main(String[] args) {
		example2 ex2 = new example2();
		ex2.addition();//50
		
		example2 ex3 = new example2(20, 60);
		ex3.addition();//80
		
		example2 ex4 = new example2(10, 20, 30);
		ex4.addition();//60
	}
}
