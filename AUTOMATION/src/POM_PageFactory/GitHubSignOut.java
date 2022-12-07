package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubSignOut {

	@FindBy(xpath="//button[contains(text(),'Sign out')]") private WebElement signOutBtn;
	
	public GitHubSignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubSignOutBtn() {
		signOutBtn.click();
	}
	
}
