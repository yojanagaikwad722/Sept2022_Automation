package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubHome {

	@FindBy(xpath="(//summary[@class='Header-link'])[2]") private WebElement logOutBtn;
	
	public GitHubHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubHomeLogOutBtn() {
		logOutBtn.click();
	}
}
