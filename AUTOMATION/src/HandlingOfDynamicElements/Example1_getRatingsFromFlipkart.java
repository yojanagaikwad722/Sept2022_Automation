package HandlingOfDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRatingsFromFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 9 pro");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		
		String ratings = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]")).getText();
		System.out.println(ratings);//26,478 Ratings 
		
		Thread.sleep(2000);
		driver.quit();
	}
}
