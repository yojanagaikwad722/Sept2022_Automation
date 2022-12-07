package ThisAndSuperKeyword;

public class ThisKeyword {

	int a = 40; //global variable

	public static void main(String[] args) {
      ThisKeyword t = new ThisKeyword();
      t.test();
	}

	public void test() {
		int a = 50;//local variable
		System.out.println(a);//50
		System.out.println(this.a);//40
	}
}
