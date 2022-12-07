package DDF_POM_TestNG_Base_Utility_Class; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GitHubSignIn {

	//1. declaration
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement signIn;
	//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	
	//2. Initialization
	public GitHubSignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void clickGitHubSignInButton() {
		signIn.click();
	}
}
