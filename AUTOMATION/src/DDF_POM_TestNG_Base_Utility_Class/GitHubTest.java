package DDF_POM_TestNG_Base_Utility_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {

	GitHubSignIn signIn;
	GitHubHome home;
	GitHubLogin login;
	GitHubSignOut signOut;

	@BeforeClass
	public void browserOpen() throws IOException {
		openBrowser();
		signIn = new GitHubSignIn(driver);
		login = new GitHubLogin(driver);
		home = new GitHubHome(driver);
		signOut = new GitHubSignOut(driver);
	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		signIn.clickGitHubSignInButton();
		login.setGitHubLoginUsername(UtilityClass.getTestData(0, 0));
		login.setGitHubLoginPassword(UtilityClass.getTestData(0, 1));
		login.clickGitHubSignInBtn();

		Thread.sleep(2000);

		home.clickGitHubHomeLogOutBtn();
		Thread.sleep(2000);
	}

	@Test
	public void test() throws EncryptedDocumentException, IOException {
		String expResult = UtilityClass.getTestData(0, 2);
		String actResult = home.verifyGitHubHomePageUN();

		Assert.assertEquals(actResult, expResult, "act & exp result is different");
	}

	//ITestResult - Listener, This class describes the result of test
	@AfterMethod
	public void logOut(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID = 100;
			UtilityClass.captureScreenshot(driver, 100);
		}
		signOut.clickGitHubSignOutBtn();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
