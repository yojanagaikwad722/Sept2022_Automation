package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		//1. getText()
		System.out.println(alt.getText());//Do you really want to delete this Customer?
		
		//2. accept() - click on OK button
		alt.accept();
		
		//3. dismiss() - click on Cancel button
		//alt.dismiss();
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());//Customer Successfully Delete!
		
		alt1.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
