package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);//to add delay or pause browser
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();//amazon
		driver.navigate().forward();//facebook
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
