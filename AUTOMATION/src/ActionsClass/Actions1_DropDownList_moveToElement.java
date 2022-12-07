package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1_DropDownList_moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act = new Actions(driver);
		
		//3. moveToElement()
		act.moveToElement(login).perform();
		
		//4. contextClick() - used to perform right click
		//act.contextClick(login).perform();
		
		//5. click() - used to perform left click
		act.click(login).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
