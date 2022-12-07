package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	@Test(invocationCount = 5, enabled = false) //The number of times this method should be invoked.
	public void TC1() {
		Reporter.log("running TC1", true);
	}
	
	@Test(priority = -3)
	public void TC2() {//by default priority = 0
		Reporter.log("running TC2", true);
	}
	
	@Test(priority = 1)
	public void TC3() {
		Reporter.log("running TC3", true);
	}
	
	@Test(priority = -3, dependsOnMethods = {"TC5"})
	public void TC4() {
		Reporter.log("running TC4", true);
	}
	
	@Test(timeOut = 2000, dependsOnMethods = {"TC2","TC3"})
	public void TC5() throws InterruptedException {
		//Thread.sleep(4000);
		Reporter.log("running TC5", true);
	}
}
