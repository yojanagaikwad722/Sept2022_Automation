package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGTestClass {

	@Test
	public void test() {
		//System.out.println("good morning");
		//Reporter.log("good morning");//message will print in HTML report
		//Reporter.log("good morning", false);//message will display in HTML report but not on Console
		Reporter.log("good morning", true);//message will display in HTML report  and on Console also
	}
}
