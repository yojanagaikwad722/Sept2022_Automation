package Casting;

public class Upcasting {

	public static void main(String[] args) {
		//inheritance
		child c1 = new child();
		c1.Money();
		c1.Bike();
		
		//upcasting
		parent s2 = new child();//create object of child class with reference to parent class
		s2.Money();
		
		//downcasting
		child c2 = (child)s2;
		c2.Money();
		c2.Bike();
	}
}
