package ThisAndSuperKeyword;

public class sample2 extends sample1{

	//	int a = 10; - sample1 -> inheritance
          
	int a = 20;
	
	public void test() {
		int a = 30;
		System.out.println(a);//30
		System.out.println(this.a);//20
		System.out.println(super.a);//10
	}
}
