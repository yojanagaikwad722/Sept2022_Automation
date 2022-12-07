package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		//step 1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2:
		Select s = new Select(month);
		
		//step 3:
		//s.selectByIndex(0);//Jan
		//s.selectByValue("9");//Sept
		s.selectByVisibleText("Jul");
		
		Thread.sleep(2000);
		driver.close();
	}
}
