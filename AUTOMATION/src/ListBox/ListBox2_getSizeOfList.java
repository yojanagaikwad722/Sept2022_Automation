package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getSizeOfList {

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
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		//step 2:
		Select s = new Select(year);
		
		//step 3:
		List<WebElement> options = s.getOptions();
		System.out.println("List Box Size:"+options.size());//118
		
		//Print all options in list box using for each loop
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
