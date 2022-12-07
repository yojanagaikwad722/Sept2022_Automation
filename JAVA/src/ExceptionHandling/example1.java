package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class example1 {

	public static void main(String[] args) {
		//int a = 10/0;
		//System.out.println(a);//ArithmeticException: / by zero
		example1 ex1 = new example1();
		ex1.test();
		
		try {
			int a = 10/0;//this may throw exception
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception found");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds exception found");
		}catch(NullPointerException e) {
			System.out.println("null pointer exception found");
		}finally {
			System.out.println("finally block always gets executed");
		}
	}
	
	public void test() {
		if(-1 < 0) {//true
			throw new ArithmeticException("Arithmetic exception found");
		}		
	}
	
	public void test1() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("abc.txt");
	}
}
