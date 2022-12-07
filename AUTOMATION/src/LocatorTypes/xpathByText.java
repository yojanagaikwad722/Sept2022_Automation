package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//xpath by text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//xpath by contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		}
}
