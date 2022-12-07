package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_sendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		// 1. sendKeys()
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("qa@pune.com");

		Thread.sleep(1000);

		// 2. clear()
		email.clear();
		Thread.sleep(1000);

		email.sendKeys("qa");

		Thread.sleep(1000);

		//4. getText() - String
		WebElement createNewAcc = driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]"));
		System.out.println(createNewAcc.getText());//Create New Account
		
		// 3. click()
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		Thread.sleep(2000);

		driver.quit();

	}
}
