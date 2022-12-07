package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		
		GitHubSignIn signIn = new GitHubSignIn(driver);
		signIn.clickGitHubSignInButton();
		
		Thread.sleep(2000);
		
		GitHubLogin login = new GitHubLogin(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHubSignInBtn();
		
		Thread.sleep(2000);
		
		GitHubHome home = new GitHubHome(driver);
		home.clickGitHubHomeLogOutBtn();
		
		Thread.sleep(4000);
		
		GitHubSignOut signOut = new GitHubSignOut(driver);
		signOut.clickGitHubSignOutBtn();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
