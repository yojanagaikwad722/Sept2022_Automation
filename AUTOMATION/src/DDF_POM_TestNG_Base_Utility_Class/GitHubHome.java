package DDF_POM_TestNG_Base_Utility_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubHome {

	@FindBy(xpath = "(//summary[@class='Header-link'])[2]")
	private WebElement logOutBtn;
	@FindBy(xpath = "//strong[text()='Yojana722']")
	private WebElement UserName;

	public GitHubHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickGitHubHomeLogOutBtn() {
		logOutBtn.click();
	}

	public String verifyGitHubHomePageUN() {
		String actResult = UserName.getText();
		return actResult;
	}
}
