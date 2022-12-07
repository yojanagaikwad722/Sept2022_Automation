package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(8000);
		
		Set<String> ifOfMainAndChildWindow = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ifOfMainAndChildWindow);
		
		driver.switchTo().window(al.get(1));//child window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(4000);
		
		driver.switchTo().window(al.get(0));//main window
		
		driver.findElement(By.xpath("//input[@name='home']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
