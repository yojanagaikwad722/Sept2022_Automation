package TypesOfAccessSpecifiers;

public class example {

	public void m1() {
		System.out.println("calling method with public access specifier");
	}
	
	private void m2() {
		System.out.println("calling method with private access specifier");
	}
	
	void m3() {
		System.out.println("calling default access specifier");
	}
	
	protected void m4() {
		System.out.println("calling protected access specifier");
	}
}
