package POM_PageFactory;

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
	
	public void setGitHubLoginUsername() {
		UN.sendKeys("yojanagaikwad101@gmail.com");
	}
	
	public void setGitHubLoginPassword() {
		PWD.sendKeys("Anubhav@2004");
	}
	
	public void clickGitHubSignInBtn() {
		signInBtn.click();
	}

	
}
