package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_getFirstSelectedOption_getAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		//step 1
		//findElement() -> WebElement
		WebElement day = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		
		//step 2
		Select s = new Select(day);
		
		s.selectByVisibleText("10");
		
		// getFirstSelectedOption() - WebElement
		WebElement firstOption = s.getFirstSelectedOption();
		System.out.println(firstOption.getText());//10
		
		//getAllSelectedOptions() - List<WebElement>
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());//10
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
