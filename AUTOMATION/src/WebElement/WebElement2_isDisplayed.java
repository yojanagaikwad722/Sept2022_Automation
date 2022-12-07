package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		//System.out.println(result);//true
		
		//boolean result = driver.findElement(By.xpath("//img[@class='aaaafb_logo _8ilh img']")).isDisplayed();
		//System.out.println(result);//NoSuchElementException
		boolean result;
		try {
			 WebElement logo = driver.findElement(By.xpath("//img[@class='aaaafb_logo _8ilh img']"));
			 result=logo.isDisplayed();			 

		} catch (Exception e) {
			result = false;
		}
		
		System.out.println(false);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
