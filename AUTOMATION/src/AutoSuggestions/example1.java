package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		String exp = "realme 9";
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("realme");
		Thread.sleep(2000);

		// Handling of multiple elements - findElements() - List<WebElement>
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

		for (WebElement option : allOptions) {
			String act = option.getText();

			if (act.equals(exp)) {
				option.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}
}
