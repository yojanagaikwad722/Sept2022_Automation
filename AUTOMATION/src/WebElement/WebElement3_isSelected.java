package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3_isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		female.click();//select
		
		Thread.sleep(1000);
		
		System.out.println(female.isEnabled());//true
		System.out.println(female.isSelected());//true
		
		Thread.sleep(1000);
		driver.quit();
	}
}
