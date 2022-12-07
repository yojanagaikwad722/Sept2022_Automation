package Casting;

public class example1 {

	public static void main(String[] args) {
		//1byte -> 2byte -> 4byte -> 8byte
		//byte -> short -> int -> long -> float -> double
		
		//1. implicit casting - widening casting(where memory size goes on increasing)
		//ex. convert byte into double
		byte b = 12; //1byte
		double d = b; //8byte
		System.out.println(d);//12.0
		
		//2. explicit casting - narrowing casting(where memory size goes on decreasing)
		//ex. convert double into byte
		double d1 = 30.0; //8byte
		byte b1 = (byte)d1; //1byte
		float f1 = (float)d1;
		System.out.println(b1);//30
		System.out.println(f1);//30.0
		
	}
}
