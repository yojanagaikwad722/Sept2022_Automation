package Polymorphism;

public class overriding extends example{

	public void wish() {
		System.out.println("good night");
	}
	
	public static void main(String[] args) {
		overriding o = new overriding();
		o.wish();
		
		example ex = new example();
		ex.wish();
	}
}
