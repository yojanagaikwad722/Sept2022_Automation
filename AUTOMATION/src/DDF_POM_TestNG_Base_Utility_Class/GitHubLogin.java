package DDF_POM_TestNG_Base_Utility_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubLogin {

	@FindBy(xpath="//input[@name='login']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='commit']") private WebElement signInBtn;
	
	public GitHubLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setGitHubLoginUsername(String username) {
		UN.sendKeys(username);
	}
	
	public void setGitHubLoginPassword(String password) {
		PWD.sendKeys(password);
	}
	
	public void clickGitHubSignInBtn() {
		signInBtn.click();
	}

	
}
