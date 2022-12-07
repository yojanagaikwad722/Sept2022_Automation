package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	//annotations -used to control the flow of methods in Test class
	@BeforeClass
	public void openBrowser() {
		//browser open
	}
	
	@BeforeMethod
	public void login() {
		//login
	}
	
	@Test
	public void verifyUN() {
		//test case 1
	}
	
	@Test
	public void verifyPWD() {
		//test case 2
	}
	
	@AfterMethod
	public void logOut() {
		//logOut
	}
	
	@AfterClass
	public void closeBrowser() {
		//close browser
	}
}
