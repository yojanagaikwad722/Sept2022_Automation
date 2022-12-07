package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions act = new Actions(driver);
		
		//6. doubleClick()- used to double click
		act.doubleClick(doubleClick).perform();
		
		//Alert popup
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());//You double clicked me.. Thank You..
		
		//accept() - used to click on OK button
		alert.accept();
		
		//dismiss() - used to click on Cancel Button
		//alert.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
