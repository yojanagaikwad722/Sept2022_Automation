package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act = new Actions(driver);//keyboard can interact with browser with the help of Actions class
		
		//1. click()
		act.click(day).perform();
		
		//2. perform() - mandatory method while using using actions class
		
		//3. sendKeys
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();//20th Nov
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}
}
