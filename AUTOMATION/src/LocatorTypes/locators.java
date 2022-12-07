package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("file:///E:/Yojana/new/Sept2022/HTML/LoginForm.html");
		Thread.sleep(2000);
		
		//1. tagName
		driver.findElement(By.tagName("input")).sendKeys("qa_automation");
		
		//2. id
		driver.findElement(By.id("1234")).sendKeys("qa@123");
		
		//3. className
		driver.findElement(By.className("xyz")).sendKeys("qa@gmail.com");
		
		//4. name
		driver.findElement(By.name("abcd")).sendKeys("124567890");
		
		//5. linkText
		//driver.findElement(By.linkText("Link")).click();
		driver.findElement(By.partialLinkText("Li")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
}
