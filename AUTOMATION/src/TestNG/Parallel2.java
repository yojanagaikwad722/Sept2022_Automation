package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {

	@Test
	public void TC2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
